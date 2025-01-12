package com.tencent.mm.plugin.voip.video.b;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cm.a.e;
import com.tencent.mm.media.g.a;
import com.tencent.mm.media.g.c;
import com.tencent.mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class d
{
  FloatBuffer UPI;
  FloatBuffer UPJ;
  public e UPK;
  a UQA;
  boolean UQB;
  boolean UQC;
  boolean UQD;
  boolean UQE;
  public float[] UQF;
  public float[] UQG;
  public float[] UQH;
  float[] UQI;
  float[] UQJ;
  com.tencent.mm.media.g.d[] UQu;
  private int[] UQv;
  private FloatBuffer UQw;
  public b UQx;
  com.tencent.mm.media.g.d UQy;
  com.tencent.mm.media.g.d UQz;
  private int mProgram;
  private FloatBuffer mVertexBuffer;
  public int outputHeight;
  public int outputWidth;
  int surfaceHeight;
  int surfaceWidth;
  
  public d()
  {
    AppMethodBeat.i(115730);
    this.mProgram = 0;
    this.UQu = new com.tencent.mm.media.g.d[3];
    this.UQv = new int[3];
    this.UQy = null;
    this.UQz = null;
    this.UQA = null;
    this.UQB = false;
    this.UQC = false;
    this.UQD = false;
    this.UQE = false;
    this.surfaceWidth = 0;
    this.surfaceHeight = 0;
    this.outputWidth = 0;
    this.outputHeight = 0;
    this.UQF = new float[8];
    this.UQG = new float[] { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
    this.UQH = new float[] { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
    this.UQI = new float[] { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
    this.UQJ = new float[] { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
    icX();
    ida();
    AppMethodBeat.o(115730);
  }
  
  static void bqi()
  {
    AppMethodBeat.i(115732);
    GLES20.glFinish();
    GLES20.glBindTexture(3553, 0);
    GLES20.glBindFramebuffer(36160, 0);
    GLES20.glUseProgram(0);
    AppMethodBeat.o(115732);
  }
  
  private void ida()
  {
    AppMethodBeat.i(115735);
    this.mProgram = f.createProgram("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision highp float;uniform sampler2D samplerY;uniform sampler2D samplerU;uniform sampler2D samplerV;uniform sampler2D samplerUV;uniform int yuvType;varying vec2 tc;void main() {  vec4 c = vec4((texture2D(samplerY, tc).r - 16./255.) * 1.164);  vec4 U; vec4 V; if (yuvType == 0 || yuvType == 1){      U = vec4(texture2D(samplerU, tc).r - 128./255.);      V = vec4(texture2D(samplerV, tc).r - 128./255.);  } else {      U = vec4(texture2D(samplerUV, tc).a - 128./255.);      V = vec4(texture2D(samplerUV, tc).r - 128./255.);  }   c += V * vec4(1.596, -0.813, 0, 0);  c += U * vec4(0, -0.392, 2.017, 0);  c.a = 1.0;  gl_FragColor = c;}");
    int i = 0;
    while (i < this.UQu.length)
    {
      this.UQu[i] = c.d(true, 14L);
      i += 1;
    }
    this.UQx = new b();
    b localb = this.UQx;
    localb.icX();
    localb.UPZ = f.createProgram("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "varying highp vec2 tc;\nuniform sampler2D inputImageTexture;\nuniform mediump float smoothDegree;\nuniform mediump int showCounter;\nuniform mediump int showMode;\n\nuniform mediump float brightness;\nuniform mediump float texelWidth;\nuniform mediump float texelHeight;\n\nprecision highp float;\nconst mat3 RGBtoYUV = mat3(0.299,  0.587, 0.114, 0.5, -0.4187, -0.0813, -0.169, -0.3313,  0.5 );    //full range\nconst mat3 YUVtoRGB = mat3(1.1643, 1.5958, 0.0, 1.1643, -0.8129, -0.3917, 1.1643, 0.0, 2.017 );\n\nconst highp mat3 saturateMatrix = mat3(\n1.1102, -0.0598, -0.061,\n-0.0774, 1.0826, -0.1186,\n-0.0228, -0.0228, 1.1772);\n\n\nvec3 rgb2hsv(vec3 c)\n{\n    vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);\n    vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));\n    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));\n\n    float d = q.x - min(q.w, q.y);\n    float e = 1.0e-10;\n    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);\n}\n\nvec3 hsv2rgb(vec3 c)\n{\n    vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);\n    vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);\n    return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);\n}\n\nvec3 yuv2rgb(vec3 c)\n{\n    vec3 rgb = YUVtoRGB*c;\n    return rgb;\n}\nvec3 rgb2yuv(vec3 c)\n{\n    vec3 yuv = c*RGBtoYUV;\n    return yuv;\n}\nmediump float hardLight(mediump float color){\n    if (color <= 0.5)\n    color = color * color * 2.0;\n    else\n    color = 1.0 - ((1.0 - color)*(1.0 - color) * 2.0);\n    return color;\n}\n\nfloat lum(vec3 v)\n{\n    return dot(v, vec3(0.299, 0.587, 0.114));\n}\n\nvec4 getValue(vec4 newValue, vec4 originValue)\n{\n    return mix(newValue, originValue, step(lum(newValue.rgb), lum(originValue.rgb)));\n}\n\nvec4 Sobel2()\n{\n    vec2 samplerSteps = vec2(1.0/texelWidth, 1.0/texelHeight);\n    vec2 coords[8];\n    coords[0] = tc - samplerSteps * 2.0;\n    coords[1] = tc + vec2(0.0, -samplerSteps.y) * 2.0;\n    coords[2] = tc + vec2(samplerSteps.x, -samplerSteps.y) * 2.0;\n\n    coords[3] = tc - vec2(samplerSteps.x, 0.0) * 2.0;\n    coords[4] = tc + vec2(samplerSteps.x, 0.0) * 2.0;\n\n    coords[5] = tc + vec2(-samplerSteps.x, samplerSteps.y) * 2.0;\n    coords[6] = tc + vec2(0.0, samplerSteps.y) * 2.0;\n    coords[7] = tc + vec2(samplerSteps.x, samplerSteps.y) * 2.0;\n\n    vec3 colors[8];\n    for(int i = 0; i < 8; ++i)\n    {\n        colors[i] = texture2D(inputImageTexture, coords[i]).rgb;\n    }\n\n    vec4 src = texture2D(inputImageTexture, tc);\n    vec3 h = -colors[0] - 2.0 * colors[1] - colors[2] + colors[5] + 2.0 * colors[6] + colors[7];\n    vec3 v = -colors[0] + colors[2] - 2.0 * colors[3] + 2.0 * colors[4] - colors[5] + colors[7];\n    return vec4(mix(src.rgb, sqrt(h * h + v * v), 1.0), src.a);\n}\n\nvec4 maxFilter()\n{\n    vec2 samplerSteps = vec2(1.0/texelWidth, 1.0/texelHeight);\n    vec2 texCoord[13];\n    vec4 vMin;\n    vec2 thisCoord = tc;\n\n    texCoord[0] = thisCoord + vec2(0, -samplerSteps.y * 2.0);\n    texCoord[1] = thisCoord - samplerSteps;\n    texCoord[2] = thisCoord + vec2(0, -samplerSteps.y);\n    texCoord[3] = thisCoord + vec2(samplerSteps.x, -samplerSteps.y);\n    texCoord[4] = thisCoord + vec2(-samplerSteps.x * 2.0, 0.0);\n    texCoord[5] = thisCoord + vec2(-samplerSteps.x, 0.0);\n    texCoord[6] = thisCoord;\n    texCoord[7] = thisCoord + vec2(samplerSteps.x, 0.0);\n    texCoord[8] = thisCoord + vec2(samplerSteps.x * 2.0, 0.0);\n    texCoord[9] = thisCoord + vec2(-samplerSteps.x, samplerSteps.y);\n    texCoord[10] = thisCoord + vec2(0.0, samplerSteps.y);\n    texCoord[11] = thisCoord + samplerSteps;\n    texCoord[12] = thisCoord + vec2(0.0, 2.0* samplerSteps.y);\n\n\n\n    {\n        vec4 vTemp;\n\n        vMin = texture2D(inputImageTexture, texCoord[0]);\n\n        vTemp = texture2D(inputImageTexture, texCoord[1]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[2]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[3]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[4]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[5]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[6]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[7]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[8]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[9]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[10]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[11]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[12]);\n        vMin = getValue(vTemp, vMin);\n    }\n    return vMin;\n}\n\nvoid main()\n{\n    //highp vec4 smoothNew;\n    highp vec3 yuv;\n    highp vec3 rgb;\n\n    vec3 centralColor = texture2D(inputImageTexture,  tc ).rgb;\n    //vec3 maxFilt = texture2D(inputImageTexture3, tc).rgb;  //canny\n    //vec3 lunkuo  = texture2D(inputImageTexture3, tc).rgb;\n\n    vec2 blurCoordinates[20];\n    vec2 imageStep = vec2(1.5/texelWidth, 1.5/texelHeight);\n\n    //重新调整了滤波的范围和权重，减少水波纹\n    blurCoordinates[0] = tc + vec2(0.0, -4.0) * imageStep;\n    blurCoordinates[1] = tc + vec2(2.0, -3.0) * imageStep;\n    blurCoordinates[2] = tc + vec2(3.0, -2.0) * imageStep;\n    blurCoordinates[3] = tc + vec2(4.0, 0.0) * imageStep;\n    blurCoordinates[4] = tc + vec2(3.0, 2.0) * imageStep;\n    blurCoordinates[5] = tc + vec2(2.0, 3.0) * imageStep;\n    blurCoordinates[6] = tc + vec2(0.0, 4.0) * imageStep;\n    blurCoordinates[7] = tc + vec2(-2.0, 3.0) * imageStep;\n    blurCoordinates[8] = tc + vec2(-3.0, 2.0) * imageStep;\n    blurCoordinates[9] = tc + vec2(-4.0, 0.0) * imageStep;\n    blurCoordinates[10] = tc + vec2(-3.0, -2.0) * imageStep;\n    blurCoordinates[11] = tc + vec2(-2.0, -3.0) * imageStep;\n\n    blurCoordinates[12] = tc + vec2(0.0, -2.0) * imageStep;\n    blurCoordinates[13] = tc + vec2(-1.0, -1.0) * imageStep;\n    blurCoordinates[14] = tc + vec2(-2.0, 0.0) * imageStep;\n    blurCoordinates[15] = tc + vec2(-1.0, 1.0) * imageStep;\n    blurCoordinates[16] = tc + vec2(0.0, 2.0) * imageStep;\n    blurCoordinates[17] = tc + vec2(1.0, 1.0) * imageStep;\n    blurCoordinates[18] = tc + vec2(2.0, 0.0) * imageStep;\n    blurCoordinates[19] = tc + vec2(1.0, -1.0) * imageStep;\n\n    //vec3 centralColor = texture2D(inputImageTexture, tc).rgb;\n    //float sampleColor = centralColor.g * 24.0;\n    vec3 sampleColor = centralColor * 24.0;\n\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[0]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[1]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[2]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[3]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[4]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[5]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[6]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[7]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[8]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[9]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[10]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[11]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[12]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[13]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[14]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[15]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[16]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[17]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[18]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[19]).rgb;\n\n    sampleColor = sampleColor/44.0;\n\n    float dis = centralColor.g - sampleColor.g + 0.5;   //high\n\n    for (int i = 0; i < 5; i++) {\n        dis = hardLight(dis);\n    }\n\n    // 0.065 -> 1.125, 加大滤波强度\n    vec3 result = centralColor * 1.125 - dis * 0.125; //central+(central-dis)*0.065\n\n    float hue = dot(result, vec3(0.299,0.587,0.114)) - 0.3;   //luminance\n    hue = pow(clamp(hue, 0.0, 1.0), 0.3);\n\n    yuv= rgb2yuv(sampleColor);\n    float cr=yuv.y-0.094;\n    float cb=yuv.z+0.0745;\n\n    float tx = ((25.59*cr-19.19*cb)*255.0 + 51.0)*0.04;\n    float ty = ((25.59*cr+19.19*cb)*255.0 + 77.0)*0.07;\n    float val0 = tx*tx + ty*ty;\n\n    float chroma_sum=yuv.y+yuv.z+1.0;\n    float chroma_diff=yuv.y-yuv.z;\n    float chroma_diff_th = 0.1-(yuv.x/10.0);\n\n    float face = 1.0;\n    if(yuv.z>-0.1667 && yuv.z<0.0294 && chroma_sum>0.7804 && chroma_sum<1.098 && chroma_diff>chroma_diff_th){\n        if(yuv.x<0.3922) {\n            if(val0<1700.0) {\n                face = 0.0;\n            } else {\n                hue = 0.0;\n            }\n        } else {\n            if(val0<3150.0) {\n                face = 0.0;\n            } else {\n                hue = 0.0;\n            }\n        }\n    } else {\n        hue = 0.0;\n    }\n\n    result = centralColor * (1.0 - hue) + result * hue;\n    result = result+vec3(brightness*0.1);\n\n    // 这里可以进一步简化计算\n    if(showMode == 1 /*|| showMode == 2*/)\n    {\n         result = vec3(hue);\n    }\n    else if(showMode == 0)\n    {\n        result = centralColor;\n    }\n\n    vec3 smoothNew = mix(centralColor, result, smoothDegree);\n\n\n//showCounter用于显示mask\nif(showCounter == 1)\n{\n    smoothNew =vec3(face);\n}\n\n//mode3:显示边缘\nif(showMode == 3)\n{\n    vec3 maxValue = maxFilter().rgb;\n    float lumOrigin = lum(centralColor);\n    float lumMax = lum(maxValue) + 0.001;\n    float blendColor = min(lumOrigin / lumMax, 1.0);\n\n    float smoothDegree2 =  0.8 + (smoothDegree/5.0); //约束范围：0.8~1.0\n    smoothNew =mix(centralColor, vec3(blendColor), smoothDegree2);\n}\n\n//mode4:显示轮廓\nif(showMode == 4)\n{\n    vec4 src  = Sobel2();\n    // saturation合并到level中\n    max(src.r, src.g);\n    float lum = (max(max(src.r, src.g),src.b) + min(min(src.r, src.g), src.b)) / 2.0;\n    src = vec4(mix(vec3(lum), src.rgb, 0.0), src.a);  //intensity = 0.0\n\n    // level filter: colorLevel.x = dark = 0.33, colorLevel.y = light = 0.60\n    float colorLevelx = 0.3;\n    float colorLevely = 0.60;\n    //float gamma = 0.99;\n    float gamma = smoothDegree;\n    src.rgb = clamp((src.rgb - colorLevelx) / (colorLevely - colorLevelx), 0.0, 1.0);\n    src.rgb = clamp(pow(src.rgb, vec3(gamma)), 0.0, 1.0);\n    smoothNew = src.rgb;\n}\n\ngl_FragColor = vec4(smoothNew, 1.0);\n}");
    localb.UQa = f.createProgram("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D inputImageTexture;\nvoid main() {\n    vec4 color = texture2D(inputImageTexture, tc);\n    gl_FragColor = color;\n}");
    this.UQy = f.icO();
    this.UQA = f.icP();
    Log.i("MicroMsg.VoipGLSProgram", "initRenderOutputFbo, texture:%s, fbo:%s", new Object[] { this.UQy, this.UQA });
    this.UQz = f.icO();
    Log.i("MicroMsg.VoipGLSProgram", "init stFilterOutputTexture, texture:%s ", new Object[] { this.UQz });
    localb = this.UQx;
    i = this.UQz.nAF;
    Log.i("MicroMsg.VoipGLSProgram", "initData, texture:%s", new Object[] { Integer.valueOf(i) });
    localb.UQb = i;
    b.B(localb.UQn);
    float[] arrayOfFloat1 = localb.UQm;
    float[] arrayOfFloat2 = localb.UQn;
    localb.UQe = ByteBuffer.allocateDirect(arrayOfFloat1.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    localb.UQe.put(arrayOfFloat1);
    localb.UQe.position(0);
    localb.UQp = ByteBuffer.allocateDirect(arrayOfFloat2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    localb.UQp.put(arrayOfFloat2);
    localb.UQp.position(0);
    this.UPK = new e();
    this.UPK.apC();
    this.UPK.pg(this.outputWidth, this.outputHeight);
    this.UPK.aFN(this.UQz.nAF);
    AppMethodBeat.o(115735);
  }
  
  final void ars(int paramInt)
  {
    int j = 2;
    AppMethodBeat.i(115731);
    GLES20.glUseProgram(this.mProgram);
    int k = GLES20.glGetAttribLocation(this.mProgram, "vPosition");
    int i = k;
    if (k < 0)
    {
      Log.e("MicroMsg.VoipGLSProgram", "int mPositionHandle error: %s, reinit program", new Object[] { Integer.valueOf(k) });
      GLES20.glDeleteProgram(this.mProgram);
      this.mProgram = f.createProgram("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision highp float;uniform sampler2D samplerY;uniform sampler2D samplerU;uniform sampler2D samplerV;uniform sampler2D samplerUV;uniform int yuvType;varying vec2 tc;void main() {  vec4 c = vec4((texture2D(samplerY, tc).r - 16./255.) * 1.164);  vec4 U; vec4 V; if (yuvType == 0 || yuvType == 1){      U = vec4(texture2D(samplerU, tc).r - 128./255.);      V = vec4(texture2D(samplerV, tc).r - 128./255.);  } else {      U = vec4(texture2D(samplerUV, tc).a - 128./255.);      V = vec4(texture2D(samplerUV, tc).r - 128./255.);  }   c += V * vec4(1.596, -0.813, 0, 0);  c += U * vec4(0, -0.392, 2.017, 0);  c.a = 1.0;  gl_FragColor = c;}");
      i = GLES20.glGetAttribLocation(this.mProgram, "vPosition");
    }
    GLES20.glEnableVertexAttribArray(i);
    GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, this.mVertexBuffer);
    i = GLES20.glGetAttribLocation(this.mProgram, "vTexCoord");
    GLES20.glEnableVertexAttribArray(i);
    GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, this.UQw);
    if ((paramInt == 0) || (paramInt == 1))
    {
      this.UQv[0] = GLES20.glGetUniformLocation(this.mProgram, "samplerY");
      this.UQv[1] = GLES20.glGetUniformLocation(this.mProgram, "samplerU");
      this.UQv[2] = GLES20.glGetUniformLocation(this.mProgram, "samplerV");
      i = 3;
    }
    for (;;)
    {
      j = 0;
      for (;;)
      {
        if (j < i)
        {
          GLES20.glActiveTexture(33984 + j);
          GLES20.glBindTexture(3553, this.UQu[j].nAF);
          GLES20.glUniform1i(this.UQv[j], j);
          j += 1;
          continue;
          if (paramInt != 3) {
            break label310;
          }
          this.UQv[0] = GLES20.glGetUniformLocation(this.mProgram, "samplerY");
          this.UQv[1] = GLES20.glGetUniformLocation(this.mProgram, "samplerUV");
          i = j;
          break;
        }
      }
      i = GLES20.glGetUniformLocation(this.mProgram, "yuvType");
      if (i >= 0) {
        GLES20.glUniform1i(i, paramInt);
      }
      GLES20.glDrawArrays(5, 0, 4);
      AppMethodBeat.o(115731);
      return;
      label310:
      i = 0;
    }
  }
  
  public final void b(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    AppMethodBeat.i(292898);
    if ((this.UPI == null) || (this.UPI.capacity() != paramArrayOfFloat1.length)) {
      this.UPI = ByteBuffer.allocateDirect(paramArrayOfFloat1.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }
    this.UPI.put(paramArrayOfFloat1);
    this.UPI.position(0);
    e.i(paramArrayOfFloat2, paramArrayOfFloat3);
    if ((this.UPJ == null) || (this.UPJ.capacity() != paramArrayOfFloat3.length)) {
      this.UPJ = ByteBuffer.allocateDirect(paramArrayOfFloat3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }
    this.UPJ.put(paramArrayOfFloat3);
    this.UPJ.position(0);
    AppMethodBeat.o(292898);
  }
  
  final void c(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(115733);
    this.UQu[paramInt3].a(paramInt1, paramInt2, 6409, paramByteBuffer, 9729, 33071);
    AppMethodBeat.o(115733);
  }
  
  public final void h(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    AppMethodBeat.i(115734);
    if ((this.mVertexBuffer == null) || (this.mVertexBuffer.capacity() != paramArrayOfFloat1.length)) {
      this.mVertexBuffer = ByteBuffer.allocateDirect(paramArrayOfFloat1.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }
    this.mVertexBuffer.put(paramArrayOfFloat1);
    this.mVertexBuffer.position(0);
    if ((this.UQw == null) || (this.UQw.capacity() != paramArrayOfFloat2.length)) {
      this.UQw = ByteBuffer.allocateDirect(paramArrayOfFloat2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }
    this.UQw.put(paramArrayOfFloat2);
    this.UQw.position(0);
    AppMethodBeat.o(115734);
  }
  
  public final void icX()
  {
    int i = 0;
    for (;;)
    {
      try
      {
        AppMethodBeat.i(115736);
        Log.i("MicroMsg.VoipGLSProgram", "%s do destroy", new Object[] { Integer.valueOf(hashCode()) });
        if (this.UQy != null) {
          this.UQy.close();
        }
        if (this.UQz != null) {
          this.UQz.close();
        }
        com.tencent.mm.media.g.d[] arrayOfd = this.UQu;
        int j = arrayOfd.length;
        if (i < j)
        {
          com.tencent.mm.media.g.d locald = arrayOfd[i];
          if (locald != null) {
            locald.close();
          }
        }
        else
        {
          if (this.UQA != null) {
            this.UQA.close();
          }
          GLES20.glDeleteProgram(this.mProgram);
          GLES20.glBindTexture(3553, 0);
          GLES20.glBindFramebuffer(36160, 0);
          GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
          GLES20.glClear(16640);
          GLES20.glFinish();
          if (this.UQw != null) {
            this.UQw.clear();
          }
          if (this.mVertexBuffer != null) {
            this.mVertexBuffer.clear();
          }
          this.UQy = null;
          this.UQz = null;
          this.UQA = null;
          this.mVertexBuffer = null;
          this.UQw = null;
          this.mProgram = 0;
          if (this.UQx != null) {
            this.UQx.icX();
          }
          if (this.UPK != null) {
            this.UPK.onDestroy();
          }
          AppMethodBeat.o(115736);
          return;
        }
      }
      finally {}
      i += 1;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes9.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.b.d
 * JD-Core Version:    0.7.0.1
 */