(function(){window.JM=window.J={$namespace:function(d){if(!d)return window;nsArr=d.split(".");d=window;i=0;for(l=nsArr.length;i<l;i++){var e=nsArr[i];d[e]=d[e]||{};d=d[e]}return d},$package:function(d,e){var a;if(typeof d=="function"){e=d;a=window}else if(typeof d=="string")a=this.$namespace(d);else if(typeof d=="object")a=d;e.call(a,this)}}})();
J.$package(function(d){var e=navigator.userAgent,a={};a.android=e.indexOf("Android")>-1;a.iPhone=e.indexOf("iPhone")>-1;a.iPad=e.indexOf("iPad")>-1;a.iPod=e.indexOf("iPod")>-1;a.winPhone=e.indexOf("IE")>-1;a.IOS=a.iPad||a.iPhone;a.touchDevice="ontouchstart"in window;d.platform=a});
J.$package(function(d){var e=document,a="classList"in document.documentElement,f={id:function(b){return e.getElementById(b)},tagName:function(b,c){c=c||e;return c.getElementsByTagName(b)},className:function(b,c){c=c||e;return c.getElementsByClassName(b)},addClass:function(){return a?function(b,c){!b||!c||f.hasClass(b,c)||b.classList.add(c)}:function(b,c){!b||!c||f.hasClass(b,c)||(b.className+=" "+c)}}(),hasClass:function(){return a?function(b,c){if(!b||!c)return false;return b.classList.contains(c)}:
function(b,c){if(!b||!c)return false;return-1<(" "+b.className+" ").indexOf(" "+c+" ")}}(),removeClass:function(){return a?function(b,c){!b||!c||!f.hasClass(b,c)||b.classList.remove(c)}:function(b,c){if(!(!b||!c||!f.hasClass(b,c)))b.className=b.className.replace(RegExp("(?:^|\\s)"+c+"(?:\\s|$)")," ")}}()};d.dom=f});J.$package(function(d){d.event={on:function(e,a,f){e.addEventListener(a,f,false)},off:function(e,a,f){e.removeEventListener(a,f,false)}}});
J.$package(function(d){var e={serializeParam:function(a){if(!a)return"";var f=[],b;for(b in a)f.push(encodeURIComponent(b)+"="+encodeURIComponent(a[b]));return f.join("&")},getUrlParam:function(a,f,b){a=(a=RegExp("(?:\\?|#|&)"+a+"=([^&]*)(?:$|&|#)","i").exec(f))?a[1]:"";return!b?decodeURIComponent(a):a},ajax:function(a){var f=a.method.toLocaleUpperCase(),b="POST"==f,c=false,j=a.overtime,g=window.XMLHttpRequest?new XMLHttpRequest:false;if(!g){a.error&&a.error.call(null,{ret:999,msg:"Create XHR Error!"});
return false}var k=e.serializeParam(a.param);!b&&(a.url+=(a.url.indexOf("?")>-1?"&":"?")+k);g.open(f,a.url,true);g.withCredentials=true;b&&g.setRequestHeader("Content-Type","application/x-www-form-urlencoded");g.onreadystatechange=function(){if(4==g.readyState){var h=g.status;if(h>=200&&h<300||h==304){h=g.responseText.replace(/(\r|\n|\t)/gi,"");a.success&&a.success(JSON.parse(h),g)}else a.error&&a.error(g);c=true}};g.send(b?k:void 0);j&&setTimeout(function(){if(!c){g.abort();a.timeout&&a.timeout(g)}},
j);return g}};d.http=e});