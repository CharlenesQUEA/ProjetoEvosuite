/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 09:07:44 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envEventoCancSubst;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envEventoCancSubst.ReferenceType;
import br.com.swconsultoria.nfe.schema.envEventoCancSubst.TransformsType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReferenceType_ESTest extends ReferenceType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      referenceType0.setURI("");
      String string0 = referenceType0.getURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      referenceType0.type = "h/~=YKTbXpdCNsP@t";
      String string0 = referenceType0.getType();
      assertEquals("h/~=YKTbXpdCNsP@t", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      referenceType0.setId("TgVgT^5el");
      String string0 = referenceType0.getId();
      assertEquals("TgVgT^5el", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      referenceType0.setId("");
      String string0 = referenceType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      byte[] byteArray0 = new byte[0];
      referenceType0.setDigestValue(byteArray0);
      byte[] byteArray1 = referenceType0.getDigestValue();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReferenceType.DigestMethod referenceType_DigestMethod0 = new ReferenceType.DigestMethod();
      String string0 = referenceType_DigestMethod0.getAlgorithm();
      assertNotNull(string0);
      assertEquals("http://www.w3.org/2000/09/xmldsig#sha1", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ReferenceType.DigestMethod referenceType_DigestMethod0 = new ReferenceType.DigestMethod();
      referenceType_DigestMethod0.setAlgorithm("TgVgT^5el");
      String string0 = referenceType_DigestMethod0.getAlgorithm();
      assertEquals("TgVgT^5el", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      referenceType0.setURI("TgVgT^5el");
      String string0 = referenceType0.getURI();
      assertEquals("TgVgT^5el", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      String string0 = referenceType0.getURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      ReferenceType.DigestMethod referenceType_DigestMethod0 = new ReferenceType.DigestMethod();
      referenceType0.setDigestMethod(referenceType_DigestMethod0);
      ReferenceType.DigestMethod referenceType_DigestMethod1 = referenceType0.getDigestMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#sha1", referenceType_DigestMethod1.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      byte[] byteArray0 = referenceType0.getDigestValue();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      TransformsType transformsType0 = referenceType0.getTransforms();
      assertNull(transformsType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      referenceType0.setType("");
      String string0 = referenceType0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      String string0 = referenceType0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      TransformsType transformsType0 = new TransformsType();
      referenceType0.setTransforms(transformsType0);
      TransformsType transformsType1 = referenceType0.getTransforms();
      assertSame(transformsType1, transformsType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      byte[] byteArray0 = new byte[2];
      referenceType0.setDigestValue(byteArray0);
      byte[] byteArray1 = referenceType0.getDigestValue();
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      ReferenceType.DigestMethod referenceType_DigestMethod0 = referenceType0.getDigestMethod();
      assertNull(referenceType_DigestMethod0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ReferenceType referenceType0 = new ReferenceType();
      String string0 = referenceType0.getId();
      assertNull(string0);
  }
}
