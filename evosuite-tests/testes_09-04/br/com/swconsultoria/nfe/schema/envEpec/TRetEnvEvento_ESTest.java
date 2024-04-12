/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:51:27 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envEpec;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envEpec.TRetEnvEvento;
import br.com.swconsultoria.nfe.schema.envEpec.TRetEvento;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TRetEnvEvento_ESTest extends TRetEnvEvento_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setXMotivo("");
      String string0 = tRetEnvEvento0.getXMotivo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVersao("");
      String string0 = tRetEnvEvento0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVerAplic("br.com.swconsultoria.nfe.schema.envEpec.SignedInfoType");
      String string0 = tRetEnvEvento0.getVerAplic();
      assertEquals("br.com.swconsultoria.nfe.schema.envEpec.SignedInfoType", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVerAplic("");
      String string0 = tRetEnvEvento0.getVerAplic();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.tpAmb = "";
      String string0 = tRetEnvEvento0.getTpAmb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      LinkedList<TRetEvento> linkedList0 = new LinkedList<TRetEvento>();
      tRetEnvEvento0.retEvento = (List<TRetEvento>) linkedList0;
      linkedList0.add((TRetEvento) null);
      List<TRetEvento> list0 = tRetEnvEvento0.getRetEvento();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setIdLote("");
      String string0 = tRetEnvEvento0.getIdLote();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setCStat(">");
      String string0 = tRetEnvEvento0.getCStat();
      assertEquals(">", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setCStat("");
      String string0 = tRetEnvEvento0.getCStat();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.cOrgao = "Q]_>)S,'a)(Na>b;L";
      String string0 = tRetEnvEvento0.getCOrgao();
      assertEquals("Q]_>)S,'a)(Na>b;L", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setCOrgao("");
      String string0 = tRetEnvEvento0.getCOrgao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.getRetEvento();
      List<TRetEvento> list0 = tRetEnvEvento0.getRetEvento();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getXMotivo();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setTpAmb("P>");
      String string0 = tRetEnvEvento0.getTpAmb();
      assertEquals("P>", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setIdLote("P>");
      String string0 = tRetEnvEvento0.getIdLote();
      assertEquals("P>", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getIdLote();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getCOrgao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getTpAmb();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVersao("P>");
      String string0 = tRetEnvEvento0.getVersao();
      assertEquals("P>", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setXMotivo("P>");
      String string0 = tRetEnvEvento0.getXMotivo();
      assertEquals("P>", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getVersao();
      assertNull(string0);
  }
}
