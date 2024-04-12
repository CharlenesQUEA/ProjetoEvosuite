/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:08:34 GMT 2024
 */

package br.com.swconsultoria.nfe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.com.swconsultoria.nfe.Validar;
import br.com.swconsultoria.nfe.dom.ConfiguracoesNfe;
import br.com.swconsultoria.nfe.dom.enuns.ServicosEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.LocatorImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Validar_ESTest extends Validar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Validar validar0 = new Validar();
      MockPrintStream mockPrintStream0 = new MockPrintStream("INUTILIZACAO");
      boolean boolean0 = validar0.isValidXml("INUTILIZACAO", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Validar validar0 = new Validar();
      Locator2Impl locator2Impl0 = new Locator2Impl();
      SAXParseException sAXParseException0 = new SAXParseException((String) null, locator2Impl0, (Exception) null);
      // Undeclared exception!
      try { 
        validar0.warning(sAXParseException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.Validar", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Validar validar0 = new Validar();
      try { 
        validar0.validaXml("cvc-complex-type\".4.c:", "\u00E9 esperado");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Schema Nfe n\u00E3o Localizado: cvc-complex-type\".4.c:
         //
         verifyException("br.com.swconsultoria.nfe.Validar", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Validar validar0 = new Validar();
      // Undeclared exception!
      try { 
        validar0.validaXml((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Validar validar0 = new Validar();
      ServicosEnum servicosEnum0 = ServicosEnum.PROC;
      // Undeclared exception!
      try { 
        validar0.validaXml((ConfiguracoesNfe) null, "", servicosEnum0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.Validar", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Validar validar0 = new Validar();
      // Undeclared exception!
      try { 
        validar0.isValidXml("mWU\"C{", ")dC", (ServicosEnum) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.Validar", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Validar validar0 = new Validar();
      // Undeclared exception!
      try { 
        validar0.isValidXml((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Validar validar0 = new Validar();
      ServicosEnum servicosEnum0 = ServicosEnum.URL_QRCODE;
      // Undeclared exception!
      try { 
        validar0.isValidXml((ConfiguracoesNfe) null, "O\"H]", servicosEnum0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.Validar", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Validar validar0 = new Validar();
      LocatorImpl locatorImpl0 = new LocatorImpl();
      SAXParseException sAXParseException0 = new SAXParseException((String) null, locatorImpl0);
      // Undeclared exception!
      try { 
        validar0.fatalError(sAXParseException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.Validar", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Validar validar0 = new Validar();
      Locator2Impl locator2Impl0 = new Locator2Impl();
      SAXParseException sAXParseException0 = new SAXParseException((String) null, locator2Impl0);
      // Undeclared exception!
      try { 
        validar0.error(sAXParseException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Validar validar0 = new Validar();
      ServicosEnum servicosEnum0 = ServicosEnum.URL_QRCODE;
      boolean boolean0 = validar0.isValidXml("O\"H]", "O\"H]", servicosEnum0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Validar validar0 = new Validar();
      SAXParseException sAXParseException0 = new SAXParseException("cvc-datatypecvc-pattn-valid^y}|c`9uK\u0005_,/oR", "cvc-datatypecvc-pattn-valid^y}|c`9uK\u0005_,/oR", "cvc-datatypecvc-pattn-valid^y}|c`9uK\u0005_,/oR", (-352756522), (-352756522));
      validar0.error(sAXParseException0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Validar validar0 = new Validar();
      SAXParseException sAXParseException0 = new SAXParseException("cvc-maxLength-validcvc-maxLength-valid\"vc-pattern-valid^y}|c`9uK~5_,/oR", "cvc-maxLength-validcvc-maxLength-valid\"vc-pattern-valid^y}|c`9uK~5_,/oR", "cvc-maxLength-validcvc-maxLength-valid\"vc-pattern-valid^y}|c`9uK~5_,/oR", (-605372443), (-605372443));
      validar0.error(sAXParseException0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Validar validar0 = new Validar();
      Locator2Impl locator2Impl0 = new Locator2Impl();
      SAXParseException sAXParseException0 = new SAXParseException("cvc-enumeration-validcvc-maxLength-valid\"vc-pattern-valid^y}|c`9uK~5_,/oR", locator2Impl0);
      validar0.error(sAXParseException0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Validar validar0 = new Validar();
      SAXParseException sAXParseException0 = new SAXParseException("cvc-pattern-vlipre%Osa estar em", "cvc-pattern-vlipre%Osa estar em", "cvc-pattern-vlipre%Osa estar em", 1067, 1067);
      validar0.error(sAXParseException0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Validar validar0 = new Validar();
      MockException mockException0 = new MockException("cvc-complex-type\".4.c:");
      LocatorImpl locatorImpl0 = new LocatorImpl();
      SAXParseException sAXParseException0 = new SAXParseException("\u00E9 esperado", locatorImpl0, mockException0);
      SAXParseException sAXParseException1 = new SAXParseException("cvc-pattern-validcvc-datatxpeeBc1By<C]AHR? KSc", "cvc-datatypeZA/MBCo\"K=!,ld)W7", "aW7a({", 4996, (-1186), sAXParseException0);
      validar0.error(sAXParseException1);
      assertFalse(sAXParseException1.equals((Object)sAXParseException0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Validar validar0 = new Validar();
      boolean boolean0 = validar0.isValidXml("", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Validar validar0 = new Validar();
      ConfiguracoesNfe configuracoesNfe0 = new ConfiguracoesNfe();
      ServicosEnum servicosEnum0 = ServicosEnum.MANIFESTACAO;
      boolean boolean0 = validar0.isValidXml(configuracoesNfe0, "cvc-pattern-vlipre%Osa estar em", servicosEnum0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Validar validar0 = new Validar();
      SAXParseException sAXParseException0 = new SAXParseException("cvc-pattern-vlipre%Osa estar em", "cvc-pattern-vlipre%Osa estar em", "cvc-pattern-vlipre%Osa estar em", 1067, 1067);
      validar0.warning(sAXParseException0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Validar validar0 = new Validar();
      LocatorImpl locatorImpl0 = new LocatorImpl();
      Locator2Impl locator2Impl0 = new Locator2Impl(locatorImpl0);
      MockException mockException0 = new MockException(")dC");
      SAXParseException sAXParseException0 = new SAXParseException("mWU\"C{", locator2Impl0, mockException0);
      validar0.fatalError(sAXParseException0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Validar validar0 = new Validar();
      ConfiguracoesNfe configuracoesNfe0 = new ConfiguracoesNfe();
      ServicosEnum servicosEnum0 = ServicosEnum.MANIFESTACAO;
      try { 
        validar0.validaXml(configuracoesNfe0, "cvc-pattern-vlipre%Osa estar em", servicosEnum0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Schema Nfe n\u00E3o Localizado: null\\envConfRecebto_v1.00.xsd
         //
         verifyException("br.com.swconsultoria.nfe.Validar", e);
      }
  }
}
