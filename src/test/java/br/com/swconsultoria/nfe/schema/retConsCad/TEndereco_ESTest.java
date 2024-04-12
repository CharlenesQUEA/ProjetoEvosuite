/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 05:22:50 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.retConsCad;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.retConsCad.TEndereco;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TEndereco_ESTest extends TEndereco_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.xMun = "IkVATgImKe7ONWx0P";
      String string0 = tEndereco0.getXMun();
      assertEquals("IkVATgImKe7ONWx0P", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setXMun("");
      String string0 = tEndereco0.getXMun();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.xLgr = "IkVATgImKe7ONWx0P";
      String string0 = tEndereco0.getXLgr();
      assertEquals("IkVATgImKe7ONWx0P", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.xLgr = "";
      String string0 = tEndereco0.getXLgr();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setXCpl("");
      String string0 = tEndereco0.getXCpl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.xBairro = "hh)'3=2Z:<Bd76?,c";
      String string0 = tEndereco0.getXBairro();
      assertEquals("hh)'3=2Z:<Bd76?,c", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setNro(" \"1o(,p6cQS4DO");
      String string0 = tEndereco0.getNro();
      assertEquals(" \"1o(,p6cQS4DO", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setNro("");
      String string0 = tEndereco0.getNro();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.cMun = "IkVATgImKe7ONWx0P";
      String string0 = tEndereco0.getCMun();
      assertEquals("IkVATgImKe7ONWx0P", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setCMun("");
      String string0 = tEndereco0.getCMun();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setCEP("*");
      String string0 = tEndereco0.getCEP();
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.cep = "";
      String string0 = tEndereco0.getCEP();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      String string0 = tEndereco0.getXBairro();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      String string0 = tEndereco0.getXLgr();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      String string0 = tEndereco0.getCEP();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      String string0 = tEndereco0.getCMun();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      String string0 = tEndereco0.getXCpl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setXLgr("");
      assertNull(tEndereco0.getXCpl());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setXCpl("1--9%lw/");
      String string0 = tEndereco0.getXCpl();
      assertEquals("1--9%lw/", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      String string0 = tEndereco0.getXMun();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      tEndereco0.setXBairro("");
      String string0 = tEndereco0.getXBairro();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TEndereco tEndereco0 = new TEndereco();
      String string0 = tEndereco0.getNro();
      assertNull(string0);
  }
}
