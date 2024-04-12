/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:42:57 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.resevento;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.resevento.KeyInfoType;
import br.com.swconsultoria.nfe.schema.resevento.SignatureType;
import br.com.swconsultoria.nfe.schema.resevento.SignatureValueType;
import br.com.swconsultoria.nfe.schema.resevento.SignedInfoType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SignatureType_ESTest extends SignatureType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignatureValueType signatureValueType0 = new SignatureValueType();
      signatureType0.setSignatureValue(signatureValueType0);
      SignatureValueType signatureValueType1 = signatureType0.getSignatureValue();
      assertNull(signatureValueType1.getId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      signatureType0.id = "";
      String string0 = signatureType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      signatureType0.setId("br.com.swconsultoria.nfe.schema.resevento.SignatureType");
      String string0 = signatureType0.getId();
      assertEquals("br.com.swconsultoria.nfe.schema.resevento.SignatureType", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      String string0 = signatureType0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = new KeyInfoType();
      signatureType0.setKeyInfo(keyInfoType0);
      KeyInfoType keyInfoType1 = signatureType0.getKeyInfo();
      assertSame(keyInfoType1, keyInfoType0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = signatureType0.getSignedInfo();
      assertNull(signedInfoType0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignatureValueType signatureValueType0 = signatureType0.getSignatureValue();
      assertNull(signatureValueType0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = signatureType0.getKeyInfo();
      assertNull(keyInfoType0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = new SignedInfoType();
      signatureType0.setSignedInfo(signedInfoType0);
      SignedInfoType signedInfoType1 = signatureType0.getSignedInfo();
      assertNull(signedInfoType1.getId());
  }
}
