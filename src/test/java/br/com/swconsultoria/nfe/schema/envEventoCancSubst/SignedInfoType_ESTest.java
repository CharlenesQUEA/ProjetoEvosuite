/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 08:53:33 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envEventoCancSubst;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envEventoCancSubst.ReferenceType;
import br.com.swconsultoria.nfe.schema.envEventoCancSubst.SignedInfoType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SignedInfoType_ESTest extends SignedInfoType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      signedInfoType0.setId("br.com.swconsultoria.nfe.schema.envEventoCancSubst.ReferenceType$DigestMethod");
      String string0 = signedInfoType0.getId();
      assertEquals("br.com.swconsultoria.nfe.schema.envEventoCancSubst.ReferenceType$DigestMethod", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = new SignedInfoType.SignatureMethod();
      String string0 = signedInfoType_SignatureMethod0.getAlgorithm();
      assertEquals("http://www.w3.org/2000/09/xmldsig#rsa-sha1", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = new SignedInfoType.CanonicalizationMethod();
      String string0 = signedInfoType_CanonicalizationMethod0.getAlgorithm();
      assertNotNull(string0);
      assertEquals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = new SignedInfoType.CanonicalizationMethod();
      signedInfoType_CanonicalizationMethod0.algorithm = "br.com.swconsultoria.nfe.schema.envEventoCancSubst.ReferenceType$DiestMethod";
      String string0 = signedInfoType_CanonicalizationMethod0.getAlgorithm();
      assertEquals("br.com.swconsultoria.nfe.schema.envEventoCancSubst.ReferenceType$DiestMethod", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = new SignedInfoType.SignatureMethod();
      signedInfoType_SignatureMethod0.setAlgorithm("zk#?06F!>;S44Av?");
      String string0 = signedInfoType_SignatureMethod0.getAlgorithm();
      assertEquals("zk#?06F!>;S44Av?", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = new SignedInfoType.CanonicalizationMethod();
      signedInfoType_CanonicalizationMethod0.setAlgorithm("br.com.swconsultoria.nfe.schema.envEventoCancSubst.ReferenceType$DigestMethod");
      assertEquals("br.com.swconsultoria.nfe.schema.envEventoCancSubst.ReferenceType$DigestMethod", signedInfoType_CanonicalizationMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      ReferenceType referenceType0 = new ReferenceType();
      signedInfoType0.setReference(referenceType0);
      ReferenceType referenceType1 = signedInfoType0.getReference();
      assertNull(referenceType1.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      ReferenceType referenceType0 = signedInfoType0.getReference();
      assertNull(referenceType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = signedInfoType0.getSignatureMethod();
      assertNull(signedInfoType_SignatureMethod0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      String string0 = signedInfoType0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      signedInfoType0.setId("");
      String string0 = signedInfoType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = signedInfoType0.getCanonicalizationMethod();
      assertNull(signedInfoType_CanonicalizationMethod0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = new SignedInfoType.SignatureMethod();
      signedInfoType0.setSignatureMethod(signedInfoType_SignatureMethod0);
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod1 = signedInfoType0.getSignatureMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#rsa-sha1", signedInfoType_SignatureMethod1.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SignedInfoType signedInfoType0 = new SignedInfoType();
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = new SignedInfoType.CanonicalizationMethod();
      signedInfoType0.setCanonicalizationMethod(signedInfoType_CanonicalizationMethod0);
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod1 = signedInfoType0.getCanonicalizationMethod();
      assertEquals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", signedInfoType_CanonicalizationMethod1.getAlgorithm());
  }
}
