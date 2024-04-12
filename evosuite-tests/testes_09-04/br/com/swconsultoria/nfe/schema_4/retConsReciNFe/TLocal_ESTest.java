/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 11:00:42 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.retConsReciNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TLocal;
import br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TUf;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TLocal_ESTest extends TLocal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setXCpl("PI");
      assertNull(tLocal0.getCPF());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setXPais("Ma)E,u\"N&{=G7yF/E");
      String string0 = tLocal0.getXPais();
      assertEquals("Ma)E,u\"N&{=G7yF/E", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setXPais("");
      String string0 = tLocal0.getXPais();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.xNome = "KbfqFuJHDtE[J|=)";
      String string0 = tLocal0.getXNome();
      assertEquals("KbfqFuJHDtE[J|=)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setXNome("");
      String string0 = tLocal0.getXNome();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.xMun = "";
      String string0 = tLocal0.getXMun();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setXLgr("PB");
      String string0 = tLocal0.getXLgr();
      assertEquals("PB", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setXLgr("");
      String string0 = tLocal0.getXLgr();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.xCpl = "=5*IT{C&\"{C)";
      String string0 = tLocal0.getXCpl();
      assertEquals("=5*IT{C&\"{C)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.xCpl = "";
      String string0 = tLocal0.getXCpl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.xBairro = "'F-e'wU.[]H rM[Sk>";
      String string0 = tLocal0.getXBairro();
      assertEquals("'F-e'wU.[]H rM[Sk>", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setXBairro("");
      String string0 = tLocal0.getXBairro();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      TUf tUf0 = TUf.RO;
      tLocal0.setUF(tUf0);
      TUf tUf1 = tLocal0.getUF();
      assertEquals(TUf.RO, tUf1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.nro = "QhM+!-";
      String string0 = tLocal0.getNro();
      assertEquals("QhM+!-", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.nro = "";
      String string0 = tLocal0.getNro();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setIE("3=UCg]dj?bb}r=^e");
      String string0 = tLocal0.getIE();
      assertEquals("3=UCg]dj?bb}r=^e", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.ie = "";
      String string0 = tLocal0.getIE();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setFone("Q62ul@t6d)c|");
      String string0 = tLocal0.getFone();
      assertEquals("Q62ul@t6d)c|", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setEmail("mX{C");
      String string0 = tLocal0.getEmail();
      assertEquals("mX{C", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setEmail("");
      String string0 = tLocal0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.cPais = "AC";
      String string0 = tLocal0.getCPais();
      assertEquals("AC", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setCPais("");
      String string0 = tLocal0.getCPais();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setCPF("PI");
      String string0 = tLocal0.getCPF();
      assertEquals("PI", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setCPF("");
      String string0 = tLocal0.getCPF();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.cnpj = "br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TLocal";
      String string0 = tLocal0.getCNPJ();
      assertEquals("br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TLocal", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.cnpj = "";
      String string0 = tLocal0.getCNPJ();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setCMun("br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TLocal");
      String string0 = tLocal0.getCMun();
      assertEquals("br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TLocal", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.cMun = "";
      String string0 = tLocal0.getCMun();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setCEP("uQ%~BU1]V|!\"uXt(X");
      String string0 = tLocal0.getCEP();
      assertEquals("uQ%~BU1]V|!\"uXt(X", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setCEP("");
      String string0 = tLocal0.getCEP();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getNro();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getXPais();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getCNPJ();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setNro("b|9X+YVGV9:<V^HJW-");
      assertNull(tLocal0.getCPais());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setFone("");
      String string0 = tLocal0.getFone();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getCPF();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getCMun();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getXCpl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setCNPJ("'eY");
      assertNull(tLocal0.getCPais());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.getUF();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getXMun();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getCEP();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getXBairro();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getIE();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      tLocal0.setXMun("br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TLocal");
      String string0 = tLocal0.getXMun();
      assertEquals("br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TLocal", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getXLgr();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getCPais();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getFone();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TLocal tLocal0 = new TLocal();
      String string0 = tLocal0.getXNome();
      assertNull(string0);
  }
}
