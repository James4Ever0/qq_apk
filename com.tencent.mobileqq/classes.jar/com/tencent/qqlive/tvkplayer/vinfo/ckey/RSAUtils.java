package com.tencent.qqlive.tvkplayer.vinfo.ckey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public final class RSAUtils
{
  private static String RSA = "RSA";
  
  public static byte[] decryptData(byte[] paramArrayOfByte, PrivateKey paramPrivateKey)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance(RSA);
      localCipher.init(2, paramPrivateKey);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      label21:
      break label21;
    }
    return null;
  }
  
  public static byte[] decryptData_pub(byte[] paramArrayOfByte, PublicKey paramPublicKey)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
      localCipher.init(2, paramPublicKey);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      label20:
      break label20;
    }
    return null;
  }
  
  public static byte[] encryptData(byte[] paramArrayOfByte, PublicKey paramPublicKey)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance(RSA);
      localCipher.init(1, paramPublicKey);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static byte[] encryptData_pri(byte[] paramArrayOfByte, PrivateKey paramPrivateKey)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
      localCipher.init(1, paramPrivateKey);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static KeyPair generateRSAKeyPair()
  {
    return generateRSAKeyPair(1024);
  }
  
  public static KeyPair generateRSAKeyPair(int paramInt)
  {
    try
    {
      Object localObject = KeyPairGenerator.getInstance(RSA);
      ((KeyPairGenerator)localObject).initialize(paramInt);
      localObject = ((KeyPairGenerator)localObject).genKeyPair();
      return localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
    }
    return null;
  }
  
  public static String getNewVid(String paramString)
  {
    try
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("magicCC");
      paramString = ((StringBuilder)localObject).toString();
      localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      for (paramString = new BigInteger(1, ((MessageDigest)localObject).digest()).toString(16).toLowerCase(); paramString.length() < 32; paramString = ((StringBuilder)localObject).toString())
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("0");
        ((StringBuilder)localObject).append(paramString);
      }
      paramString = paramString.substring(0, 12);
      return paramString;
    }
    catch (Throwable paramString)
    {
      label109:
      break label109;
    }
    return "";
  }
  
  public static PrivateKey getPrivateKey(String paramString1, String paramString2)
  {
    paramString1 = new RSAPublicKeySpec(new BigInteger(paramString1), new BigInteger(paramString2));
    return KeyFactory.getInstance(RSA).generatePrivate(paramString1);
  }
  
  public static PrivateKey getPrivateKey(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new PKCS8EncodedKeySpec(paramArrayOfByte);
    return KeyFactory.getInstance(RSA).generatePrivate(paramArrayOfByte);
  }
  
  public static PublicKey getPublicKey(String paramString1, String paramString2)
  {
    paramString1 = new RSAPublicKeySpec(new BigInteger(paramString1), new BigInteger(paramString2));
    return KeyFactory.getInstance(RSA).generatePublic(paramString1);
  }
  
  public static PublicKey getPublicKey(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new X509EncodedKeySpec(paramArrayOfByte);
    return KeyFactory.getInstance(RSA).generatePublic(paramArrayOfByte);
  }
  
  public static PrivateKey loadPrivateKey(InputStream paramInputStream)
  {
    try
    {
      paramInputStream = loadPrivateKey(readKey(paramInputStream));
      return paramInputStream;
    }
    catch (IOException paramInputStream)
    {
      break label20;
    }
    catch (NullPointerException paramInputStream)
    {
      label10:
      label20:
      break label10;
    }
    throw new Exception("私钥输入流为空");
    throw new Exception("私钥数据读取错误");
  }
  
  public static PrivateKey loadPrivateKey(String paramString)
  {
    try
    {
      paramString = new PKCS8EncodedKeySpec(Base64Utils.decode(paramString));
      paramString = (RSAPrivateKey)KeyFactory.getInstance(RSA).generatePrivate(paramString);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      break label48;
    }
    catch (InvalidKeySpecException paramString)
    {
      break label38;
    }
    catch (NullPointerException paramString)
    {
      label28:
      label38:
      label48:
      break label28;
    }
    throw new Exception("私钥数据为空");
    throw new Exception("私钥非法");
    throw new Exception("无此算法");
  }
  
  public static PublicKey loadPublicKey(InputStream paramInputStream)
  {
    try
    {
      paramInputStream = loadPublicKey(readKey(paramInputStream));
      return paramInputStream;
    }
    catch (IOException paramInputStream)
    {
      break label20;
    }
    catch (NullPointerException paramInputStream)
    {
      label10:
      label20:
      break label10;
    }
    throw new Exception("公钥输入流为空");
    throw new Exception("公钥数据流读取错误");
  }
  
  public static PublicKey loadPublicKey(String paramString)
  {
    try
    {
      paramString = Base64Utils.decode(paramString);
      paramString = (RSAPublicKey)KeyFactory.getInstance(RSA).generatePublic(new X509EncodedKeySpec(paramString));
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      break label48;
    }
    catch (InvalidKeySpecException paramString)
    {
      break label38;
    }
    catch (NullPointerException paramString)
    {
      label28:
      label38:
      label48:
      break label28;
    }
    throw new Exception("公钥数据为空");
    throw new Exception("公钥非法");
    throw new Exception("无此算法");
  }
  
  public static void printPrivateKeyInfo(PrivateKey paramPrivateKey)
  {
    paramPrivateKey = (RSAPrivateKey)paramPrivateKey;
    System.out.println("----------RSAPrivateKey ----------");
    PrintStream localPrintStream = System.out;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Modulus.length=");
    localStringBuilder.append(paramPrivateKey.getModulus().bitLength());
    localPrintStream.println(localStringBuilder.toString());
    localPrintStream = System.out;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("Modulus=");
    localStringBuilder.append(paramPrivateKey.getModulus().toString());
    localPrintStream.println(localStringBuilder.toString());
    localPrintStream = System.out;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("PrivateExponent.length=");
    localStringBuilder.append(paramPrivateKey.getPrivateExponent().bitLength());
    localPrintStream.println(localStringBuilder.toString());
    localPrintStream = System.out;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("PrivatecExponent=");
    localStringBuilder.append(paramPrivateKey.getPrivateExponent().toString());
    localPrintStream.println(localStringBuilder.toString());
  }
  
  public static void printPublicKeyInfo(PublicKey paramPublicKey)
  {
    paramPublicKey = (RSAPublicKey)paramPublicKey;
    System.out.println("----------RSAPublicKey----------");
    PrintStream localPrintStream = System.out;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Modulus.length=");
    localStringBuilder.append(paramPublicKey.getModulus().bitLength());
    localPrintStream.println(localStringBuilder.toString());
    localPrintStream = System.out;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("Modulus=");
    localStringBuilder.append(paramPublicKey.getModulus().toString());
    localPrintStream.println(localStringBuilder.toString());
    localPrintStream = System.out;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("PublicExponent.length=");
    localStringBuilder.append(paramPublicKey.getPublicExponent().bitLength());
    localPrintStream.println(localStringBuilder.toString());
    localPrintStream = System.out;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("PublicExponent=");
    localStringBuilder.append(paramPublicKey.getPublicExponent().toString());
    localPrintStream.println(localStringBuilder.toString());
  }
  
  private static String readKey(InputStream paramInputStream)
  {
    paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream));
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      String str = paramInputStream.readLine();
      if (str == null) {
        break;
      }
      if (str.charAt(0) != '-')
      {
        localStringBuilder.append(str);
        localStringBuilder.append('\r');
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes14.jar
 * Qualified Name:     com.tencent.qqlive.tvkplayer.vinfo.ckey.RSAUtils
 * JD-Core Version:    0.7.0.1
 */