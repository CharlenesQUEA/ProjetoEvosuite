/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 11:33:09 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.epec;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.epec.KeyInfoType;
import br.com.swconsultoria.nfe.schema.epec.SignatureType;
import br.com.swconsultoria.nfe.schema.epec.SignatureValueType;
import br.com.swconsultoria.nfe.schema.epec.SignedInfoType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SignatureType_ESTest extends SignatureType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = new KeyInfoType();
      signatureType0.setKeyInfo(keyInfoType0);
      assertNull(signatureType0.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = new SignedInfoType();
      signatureType0.signedInfo = signedInfoType0;
      SignedInfoType signedInfoType1 = signatureType0.getSignedInfo();
      assertSame(signedInfoType1, signedInfoType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignatureValueType signatureValueType0 = new SignatureValueType();
      signatureType0.setSignatureValue(signatureValueType0);
      SignatureValueType signatureValueType1 = signatureType0.getSignatureValue();
      assertNull(signatureValueType1.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = new KeyInfoType();
      signatureType0.keyInfo = keyInfoType0;
      KeyInfoType keyInfoType1 = signatureType0.getKeyInfo();
      assertNull(keyInfoType1.getId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      signatureType0.setId("http://www.w3.org/2000/09/xmldsig#sha1");
      String string0 = signatureType0.getId();
      assertEquals("http://www.w3.org/2000/09/xmldsig#sha1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      signatureType0.setId("");
      String string0 = signatureType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = signatureType0.getKeyInfo();
      assertNull(keyInfoType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignatureValueType signatureValueType0 = signatureType0.getSignatureValue();
      assertNull(signatureValueType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = signatureType0.getSignedInfo();
      assertNull(signedInfoType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      String string0 = signatureType0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = new SignedInfoType();
      signatureType0.setSignedInfo(signedInfoType0);
      assertNull(signedInfoType0.getId());
  }
}
