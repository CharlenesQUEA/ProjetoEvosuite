/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 09:11:54 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.cce;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.cce.KeyInfoType;
import br.com.swconsultoria.nfe.schema.cce.SignatureType;
import br.com.swconsultoria.nfe.schema.cce.SignatureValueType;
import br.com.swconsultoria.nfe.schema.cce.SignedInfoType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SignatureType_ESTest extends SignatureType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = new KeyInfoType();
      signatureType0.setKeyInfo(keyInfoType0);
      assertNull(signatureType0.getId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = new KeyInfoType();
      signatureType0.keyInfo = keyInfoType0;
      KeyInfoType keyInfoType1 = signatureType0.getKeyInfo();
      assertNull(keyInfoType1.getId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      signatureType0.id = "$s1:R8@4P2#.*'I";
      String string0 = signatureType0.getId();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = signatureType0.getSignedInfo();
      assertNull(signedInfoType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = signatureType0.getKeyInfo();
      assertNull(keyInfoType0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignatureValueType signatureValueType0 = new SignatureValueType();
      signatureType0.setSignatureValue(signatureValueType0);
      SignatureValueType signatureValueType1 = signatureType0.getSignatureValue();
      assertNull(signatureValueType1.getId());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      String string0 = signatureType0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignatureValueType signatureValueType0 = signatureType0.getSignatureValue();
      assertNull(signatureValueType0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      signatureType0.setId("");
      String string0 = signatureType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = new SignedInfoType();
      signatureType0.setSignedInfo(signedInfoType0);
      SignedInfoType signedInfoType1 = signatureType0.getSignedInfo();
      assertNull(signedInfoType1.getId());
  }
}
