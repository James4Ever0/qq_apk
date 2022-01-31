QfavEditor = {};

QfavEditor.E = function() {
    this.__defineGetter__("rootElement", this.getRootElement);
    this.__defineGetter__("changeDisabled", this.getDisableChanged);
}

QfavEditor.E.prototype._ignoredChangeCount = 0;
QfavEditor.E.prototype._rootElement = null;
QfavEditor.E.prototype._currentRange = null;
QfavEditor.E.prototype.getRootElement = function getRootElement() {
    if (!this._rootElement) {
    		this._rootElement = document.getElementById('QMEditor');
    		console.log('get root element');
    }
    
    return this._rootElement;
};


QfavEditor.E.prototype.getDisableChanged = function(){
    return this._ignoredChangeCount > 0;
}

QfavEditor.E.prototype._bindEvents = function() {
	var _oSelf = this;
    this.rootElement.addEventListener('DOMSubtreeModified',  function() {_oSelf._onDomSubtreeModified();} , false);
    this.rootElement.addEventListener('focus', function() { _oSelf._onFocus(); }, true);
    this.rootElement.addEventListener('focusout', function() { _oSelf._onFocusOut(); }, true);
	this.rootElement.addEventListener('blur', function() { _oSelf._onblur(); }, true);
    this.rootElement.addEventListener('touchend', function() { _oSelf._onTapEnd(); }, true);
	this.rootElement.addEventListener('click', function() { _oSelf._onClick(); }, true);
    document.addEventListener("paste", function() { _oSelf._onPaste(); }, false);
	document.addEventListener("input", function() { _oSelf._onInput(); }, false);
}

QfavEditor.E.prototype._onDomSubtreeModified = function(e){
    var self = this;

   // QfavUtil.log('_onDomSubtreeModified _ignoredChangeCount:' + self._ignoredChangeCount);
    if (!self.changeDisabled) {
    		window.location.href = "qfavnotify://domChange";
    		
        QfavUtil.notify('domSubtreeModifiedFromJs');
        self.tellSelectionRect(false);
    }
}

QfavEditor.E.prototype._onPaste = function(e) {
    setTimeout(function(){
        QfavUtil.notify('pasteFromJs');
    },0);
}

QfavEditor.E.prototype._onFocus = function(e) {
    QfavUtil.log('_onFocus');
    var self = this;
    
    //QfavEditor._editor.restoreSelection();
    
    self.restoreCurrentSelection2();
    //this._currentRange = null;
}

QfavEditor.E.prototype._onFocusOut = function(e) {
    QfavUtil.log('_onFocusOut');
    QfavEditor._editor.storeCurrentSelection();
}

QfavEditor.E.prototype._onblur = function(e) {
    QfavUtil.log('_onblur');
    //QfavEditor._editor.storeCurrentSelection();
    this.storeCurrentSelection2();
}

QfavEditor.E.prototype._onTapEnd = function(e) {
    QfavUtil.log('_onTapEnd');
   // QfavEditor._editor.storeCurrentSelection();
    
    this._currentRange = null;
}
QfavEditor.E.prototype._onClick = function(e) {
	QfavUtil.log('_onClick');
	this.notifyOnClickQfavEditor();
}

QfavEditor.E.prototype.ignoreChange = function(igore) {
    if(igore) {
        this._ignoredChangeCount++;
    } else {
        this._ignoredChangeCount--;
    }
}

QfavEditor.E.prototype.getClientSize = function() {
	var w = this.rootElement.scrollWidth;
	var h = this.rootElement.scrollHeight;
    return {w:w, h:h};
}

QfavEditor.E.prototype.restoreCurrentSelection2 = function restoreCurrentSelection2() {
	var self = this;
    
    if (self._currentRange) {
    		var sel = window.getSelection();
    		if (sel) {
    			sel.removeAllRanges();
    			sel.addRange(self._currentRange);
    		}
    		self._currentRange = null;
    		
    		console.log('restoreCurrentSelection2');
    } else {
    		console.log('restoreCurrentSelection2|last sel range null');
    }
}

QfavEditor.E.prototype.storeCurrentSelection2 = function storeCurrentSelection2() {
	var self = this;
	
    var sel = window.getSelection();
    
    if (sel && sel.rangeCount > 0) {
    		self._currentRange = sel.getRangeAt(0);
    		sel.removeAllRanges();
    		
    		console.log('storeCurrentSelection2|save range 0, then remove all ranges');
    } else {
    		self._currentRange = null;
    		
    		console.log('storeCurrentSelection2|sel range count 0');
    }
}

QfavEditor.E.prototype.storeCurrentSelection = function storeCurrentSelection() {
  /*  QfavUtil.log('before storeCurrentSelection');
    var sel = window.getSelection();
    if (sel.rangeCount > 0) {
        this._currentRange = sel.getRangeAt(0);
        QfavUtil.log('current range');
        QfavUtil.log(this._currentRange.getBoundingClientRect());
    } else {
        QfavUtil.log('sel.rangeCount == 0');
    }
    QfavUtil.log('after storeCurrentSelection');*/
};

QfavEditor.E.prototype.restoreSelection = function restoreSelection(invalidateEnd) {
 /*   QfavUtil.log('before restoreSelection');
    var sel = window.getSelection();
    if (this._currentRange) {
        sel.removeAllRanges();
        sel.addRange(this._currentRange);
        console.log('current range: ' + this._currentRange.toString());
    }
    QfavUtil.log('after restoreSelection'); */
};

QfavEditor.E.prototype.getSelectionRect = function (absolute) {
    void(0);
    var sel = window.getSelection();
    var rect = null;
    var r = null;
	
	//var cursorPos = this.getSelectionCoords();
	//QfavUtil.log('cursorPos :' + cursorPos.x + ' ' + cursorPos.y);
    try {
    	var baseNode = sel.baseNode;
    	var baseOffset = sel.baseOffset;

        this.ignoreChange(true);

        if (sel.baseNode) {
            void(0);
            baseOffset = sel.baseOffset;
            var charRange = null;
            var txt = baseNode.textContent;
            var txtLen = txt.length;

            if (baseNode.nodeType == Node.TEXT_NODE) {
                void(0);
                if (baseOffset > 0) {
                    QfavUtil.log('baseOffset:' + baseOffset);
					QfavUtil.log('txt.length:' + txt.length);
					QfavUtil.log('baseNode.textContent:' +baseNode.textContent);
					QfavUtil.log('sel.baseNode:' + sel.baseNode);
					QfavUtil.log('sel.baseNode.childNodes lenght:' + sel.baseNode.childNodes.length);
					for (i = 0; i < sel.baseNode.childNodes.length; ++ i) {
						QfavUtil.log('sel.baseNode.childNodes:child ' + i + ' ' + sel.baseNode.childNodes[i]);
					}
					QfavUtil.log('sel.rangeCount:' + sel.rangeCount);
                    void(0);
					if (baseOffset == txt.length) {
						var parentNode = baseNode.parentElement;
						var tempDiv = document.createElement("div");
					
						
						var baseNodeStyle = window.getComputedStyle(sel.baseNode, '');
						var tempDivHeight = 16;
						tempDiv.style.cssText = "display: inline-block; position: relative; padding: 0px; margin: 0px; float: none; width: 0px; height: " + tempDivHeight + "px;";
					
						if (baseNode.nextSibling == null) {
							parentNode.appendChild(tempDiv);
						} else {
							parentNode.insertBefore(tempDiv, baseNode.nextSibling);
						}
						
						rect = {left : tempDiv.offsetLeft, top : tempDiv.offsetTop, right : tempDiv.offsetLeft + tempDiv.offsetWidth, bottom : tempDiv.offsetTop + tempDiv.offsetHeight};
						tempDiv.parentNode.removeChild(tempDiv);
					} else {
						 charRange = document.createRange();
						charRange.setStart(baseNode, baseOffset - 1);
						charRange.setEnd(baseNode, baseOffset);
						
						rect = charRange.getBoundingClientRect();

						QfavUtil.log('rect:' + rect.top + ' ' + rect.bottom + ' ' + baseOffset + ' ' + txtLen);
						if (rect.bottom <= rect.top) {

							if(baseOffset < txtLen - 3) {
								charRange.setEnd(baseNode, baseOffset + 2);
								rect = charRange.getBoundingClientRect();
							} else if(baseOffset > 3){
								charRange.setStart(baseNode, baseOffset - 2);
								charRange.setEnd(baseNode, baseOffset);
								rect = charRange.getBoundingClientRect();
							}
						} 

						if(rect) {
							rect = {left : rect.right - 1, top : rect.top, right : rect.right + 1, bottom : rect.bottom};
						}
					}
                   
                } else if (txtLen > 0) {
                    QfavUtil.log('TEXT_NODE txtLen > 0');
                    void(0);
                    charRange = document.createRange();
                    charRange.setStart(baseNode, baseOffset);
                    charRange.setEnd(baseNode, baseOffset + 1);
                    rect = charRange.getBoundingClientRect();
                    if (rect) {
                        rect = {left : rect.right - 1, top : rect.top, right : rect.right + 1, bottom : rect.bottom};
                    }
                } else {
                    void(0);
                    rect = baseNode.parentElement.getBoundingClientRect();
                    if (rect) {
                        rect = {left : rect.right - 1, top : rect.top, right : rect.right + 1, bottom : rect.bottom};
                    }
                }
            } else  {
                this.ignoreChange(true);
				
                QfavUtil.log('begin getSelection base node not equal root');
				
				if (!rect || rect.height == 0) {  
					var baseNodeStyle = window.getComputedStyle(sel.baseNode, '');
					
					void(0);
					
					var tempDiv = document.createElement("img");
					
					var baseNodeStyle = window.getComputedStyle(sel.baseNode, '');
					var tempDivHeight = parseFloat(baseNodeStyle.getPropertyValue("font-size"));
					if (!tempDivHeight) {
						tempDivHeight = 20;
					}
					tempDiv.style.cssText = "display: inline-block; position: relative; padding: 0px; margin: 0px; float: none; width: 0px; height: " + tempDivHeight + "px;";
					QfavUtil.log('sel.baseNode:' + sel.baseNode);
					QfavUtil.log('sel.baseNode.childNodes lenght:' + sel.baseNode.childNodes.length);
					for (i = 0; i < sel.baseNode.childNodes.length; ++ i) {
						QfavUtil.log('sel.baseNode.childNodes:child ' + i + ' ' + sel.baseNode.childNodes[i]);
					}
					QfavUtil.log('sel.baseOffset:' + sel.baseOffset);
					var offset = sel.baseOffset;
					if (sel.baseOffset == sel.baseNode.childNodes.length) {
						sel.baseNode.appendChild(tempDiv);
					} else {
						if (sel.baseOffset > 0 && sel.baseNode.childNodes[sel.baseOffset-1].childNodes.length != 0) {
							sel.baseNode.childNodes[sel.baseOffset-1].appendChild(tempDiv);
						} else {
							sel.baseNode.insertBefore(tempDiv, sel.baseNode.childNodes[sel.baseOffset]);
						}
					}
					QfavUtil.log('sel.baseNode.childNodes[sel.baseOffset]' + sel.baseNode.childNodes[offset]);
					
					rect = {left : tempDiv.offsetLeft, top : tempDiv.offsetTop, right : tempDiv.offsetLeft + tempDiv.offsetWidth, bottom : tempDiv.offsetTop + tempDiv.offsetHeight};
					tempDiv.parentNode.removeChild(tempDiv);
					QfavUtil.log('end getSelection base node not equal root');   
				}
                this.ignoreChange(false);    
            }
        }

        QfavUtil.log('select baseNode:' + baseOffset);
        QfavUtil.log(baseNode);
        
    } catch (e) {
        void(0);
        void(0);
        QfavUtil.log(e.message);
    } finally {
        this.ignoreChange(false);
    }
    
    this.storeCurrentSelection();

    return rect ? rect : {left : 0, top : 0, right : 0, bottom : 0};
};


QfavEditor.E.prototype.notifySelectionRect = function() {
    var clientSize = this.getClientSize();
    QfavUtil.log('begin getClientSize');
    QfavUtil.log(clientSize);
    QfavUtil.log('end getClientSize');
    QfavUtil.log('begin getSelectionRect');
    var selRect = this.getSelectionRect(true);
    QfavUtil.log(selRect);
    QfavUtil.log('end getSelectionRect');
    QfavUtil.notify('selectionRectChangedFromJs', {w : clientSize.w, h : clientSize.h, sl : selRect.left, st : selRect.top, sr : selRect.right, sb :selRect.bottom });
}

QfavEditor.E.prototype.notifyOnClickQfavEditor = function() {
    var clientSize = this.getClientSize();
    QfavUtil.log('begin getClientSize');
    QfavUtil.log(clientSize);
    QfavUtil.log('end getClientSize');
    QfavUtil.log('begin getSelectionRect');
    var selRect = this.getSelectionRect(true);
    QfavUtil.log(selRect);
    QfavUtil.log('end getSelectionRect');
    QfavUtil.notify('onClickQfavEditor', {w : clientSize.w, h : clientSize.h, sl : selRect.left, st : selRect.top, sr : selRect.right, sb :selRect.bottom });
}

QfavEditor.E.prototype.tellSelectionRect = function(sync) {
    if (this._selectionNotifyTimeID) {
        clearTimeout(this._selectionNotifyTimeID);
        this._selectionNotifyTimeID = null;
    }
    if (!sync) {
        var self = this;
        this._selectionNotifyTimeID = setTimeout(function() {self.notifySelectionRect();}, 100);
    } else {
        this.notifySelectionRect();
    }
}

QfavEditor.E.prototype.getInnerHtml = function() {
    return this.rootElement.innerHTML;
}

QfavEditor.E.prototype.getInnerText = function() {
    return this.rootElement.innerText;
}

QfavEditor.E.prototype.checkInnerText = function() {
	var html = this.getInnerHtml();
	var html2 = html.replace(/<br\s*\/?>|&nbsp;/g, '');
	var txt = this.getInnerText().trim();
	var htmLen = html2.length;
	var txtLen = txt.length;
	
	//var bDisableRightBtn = (htmLen<=0) || (len>40000);
	
	//console.log('checkInnerText|txtLen='+txtLen+',htmLen='+htmLen+',txt='+txt+',html='+html+',html2='+html2);
	console.log('checkInnerText|txtLen='+txtLen+',htmLen='+htmLen);
	
	QfavUtil.notify('enableRightBtn', {txtlen:txtLen, htmlen:htmLen});
		
	/*if (bDisableRightBtn) {
		if (len!=0 && htmLen>0) {
			QfavUtil.notify('enableRightBtn', {b:false, l:(40000-len)});
			//window.location.href = "qmeditor://enableRightBtn?false&"+(40000-len);
		} else {
			QfavUtil.notify('enableRightBtn', {b:false});
			//window.location.href = "qmeditor://enableRightBtn?false";
		}
	} else {
		QfavUtil.notify('enableRightBtn', {b:true, l:(40000-len)});
		//window.location.href = "qmeditor://enableRightBtn?true&"+(40000-len);
	}*/
	
	/*QfavUtil.log('');
	if (!QfavEditor._editor.changeDisabled) {
        //QfavEditor._editor.notifySelectionRect('domSubtreeModifiedFromJs');
    }*/
}

QfavEditor.E.prototype._onInput = function () {
	var self = this;
	if (self._checkInnerTextTimeID) {
		console.log('_onInput|clear last check timer. ' + self._checkInnerTextTimeID);
		clearTimeout(self._checkInnerTextTimeID);
		self._checkInnerTextTimeID = null;
	}
	
	console.log('_onInput|set timer for input check, interval 200ms');
	self._checkInnerTextTimeID = setTimeout(function() {self.checkInnerText()}, 200);
}

QfavEditor._editor = new QfavEditor.E();


QfavEditor.start = function() {
    QfavEditor._editor.rootElement.setAttribute("contentEditable", true);
    QfavEditor._editor._bindEvents();
	QfavEditor._editor.rootElement.focus();
}

QfavEditor.excuteBridgeCallback = function() {
    QfavUtil.excuteCallback.apply(QfavUtil, [].slice.apply(arguments));
}

QfavEditor.getHtml = function() {
	var contentHtml = QfavEditor._editor.getInnerHtml();
	var tmp = contentHtml.replace(/<br\s*\/?>|&nbsp;/g, '');
	if (tmp.length == 0) {
		contentHtml = "";
	}
	contentHtml = encodeURIComponent(contentHtml);
	
	//QfavUtil.log('getHtml:' + contentHtml);
	//QfavUtil.notify('getHtml', {content:contentHtml});
	window.location.href = "qfavnotify://getHtml?" + contentHtml;
}

QfavEditor.saveDraft = function() {
	var contentHtml = QfavEditor._editor.getInnerHtml();
	contentHtml = encodeURIComponent(contentHtml);
	//QfavUtil.notify('saveDraft', contentHtml);
	window.location.href = "qfavnotify://saveDraft?" + contentHtml;
}	

QfavEditor.setFirstFocus = function() {
	QfavEditor._editor.rootElement.focus();
	var sel = window.getSelection();
	sel.setBaseAndExtent(QfavEditor._editor.rootElement, 0, QfavEditor._editor.rootElement, 0);
	QfavEditor._editor.rootElement.focus();
}
//QfavEditor.getHtml = function() {
//    return QfavEditor._editor.getInnerHtml();
//}
QfavEditor.setImgSrc = function(name, src, bForce) { 
	elmts = document.getElementsByName(name);
	for(i=0; i<elmts.length; ++i) {
		if(bForce) {
			elmts[i].src = src;
		} 
		else if(elmts[i].src=='' && !bForce) {
			elmts[i].src = src; 
		}
	}
}

QfavEditor.getText = function() {
    return QfavEditor._editor.getInnerText();
}

QfavEditor.insertHTML = function(value, ingore, isFirst) {
	QfavEditor._editor.restoreCurrentSelection2();
	
	if (ingore) {
		QfavEditor._editor.ignoreChange(true);
	}
	var r = document.execCommand("insertHTML", false, value);
	if (ingore) {
		QfavEditor._editor.ignoreChange(false);
	}
	if (isFirst) {
		QfavEditor._editor.tellSelectionRect(false);
	}
	console.log('insertHTML|input check');
	QfavEditor._editor._onInput();
    return r;
}


QfavEditor.insertText = function(value) {
    return document.execCommand("insertText", false, value);
}

QfavEditor.delete = function() {
    document.execCommand("delete");
}

QfavEditor.becomeFirstResponder = function() {
    QfavEditor._editor.rootElement.focus();
}

QfavEditor.resignFirstResponder = function() {
    QfavEditor._editor.rootElement.blur();
}

QfavEditor.retellSelectionRect = function() {
    QfavEditor._editor.tellSelectionRect(false);
}