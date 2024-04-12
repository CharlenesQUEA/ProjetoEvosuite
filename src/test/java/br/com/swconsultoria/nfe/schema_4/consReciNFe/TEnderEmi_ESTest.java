/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 11:10:37 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.consReciNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.consReciNFe.TEnderEmi;
import br.com.swconsultoria.nfe.schema_4.consReciNFe.TUfEmi;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TEnderEmi_ESTest extends TEnderEmi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setFone("MG");
      assertNull(tEnderEmi0.getUF());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setXPais("{zXO=a5E?i'$six");
      String string0 = tEnderEmi0.getXPais();
      assertEquals("{zXO=a5E?i'$six", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setXPais("");
      String string0 = tEnderEmi0.getXPais();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.xMun = "AC";
      String string0 = tEnderEmi0.getXMun();
      assertEquals("AC", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setXMun("");
      String string0 = tEnderEmi0.getXMun();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setXLgr("BA");
      String string0 = tEnderEmi0.getXLgr();
      assertEquals("BA", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setXLgr("");
      String string0 = tEnderEmi0.getXLgr();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.xCpl = ">SEjR~.8e/kEqkR, Y";
      String string0 = tEnderEmi0.getXCpl();
      assertEquals(">SEjR~.8e/kEqkR, Y", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setXCpl("");
      String string0 = tEnderEmi0.getXCpl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setXBairro("RO");
      String string0 = tEnderEmi0.getXBairro();
      assertEquals("RO", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.xBairro = "`o/aEYd4wm3m}<;`D)p";
      tEnderEmi0.xBairro = "";
      String string0 = tEnderEmi0.getXBairro();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      TUfEmi tUfEmi0 = TUfEmi.PR;
      tEnderEmi0.uf = tUfEmi0;
      TUfEmi tUfEmi1 = tEnderEmi0.getUF();
      assertEquals(TUfEmi.PR, tUfEmi1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setNro("u9^Bt17:5|U>{i");
      String string0 = tEnderEmi0.getNro();
      assertEquals("u9^Bt17:5|U>{i", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.fone = "XT2Q8bTZh";
      String string0 = tEnderEmi0.getFone();
      assertEquals("XT2Q8bTZh", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.fone = "";
      String string0 = tEnderEmi0.getFone();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setCPais("DF");
      String string0 = tEnderEmi0.getCPais();
      assertEquals("DF", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setCPais("");
      String string0 = tEnderEmi0.getCPais();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.cMun = "";
      String string0 = tEnderEmi0.getCMun();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.cep = "AM";
      String string0 = tEnderEmi0.getCEP();
      assertEquals("AM", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setCEP("");
      String string0 = tEnderEmi0.getCEP();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setNro("");
      String string0 = tEnderEmi0.getNro();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getXCpl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.setCMun("h|-$x;?YjR5+");
      String string0 = tEnderEmi0.getCMun();
      assertEquals("h|-$x;?YjR5+", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getXLgr();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getCMun();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getNro();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getXBairro();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getCEP();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      tEnderEmi0.getUF();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getXMun();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      TUfEmi tUfEmi0 = TUfEmi.PR;
      tEnderEmi0.setUF(tUfEmi0);
      assertNull(tEnderEmi0.getXLgr());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getXPais();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getFone();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TEnderEmi tEnderEmi0 = new TEnderEmi();
      String string0 = tEnderEmi0.getCPais();
      assertNull(string0);
  }
}
