/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 11:12:30 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.retenvcce;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.retenvcce.TRetEnvEvento;
import br.com.swconsultoria.nfe.schema.retenvcce.TretEvento;
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
      tRetEnvEvento0.xMotivo = "uT ,D'VK";
      String string0 = tRetEnvEvento0.getXMotivo();
      assertEquals("uT ,D'VK", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setXMotivo("");
      String string0 = tRetEnvEvento0.getXMotivo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVersao("5LLw{V+Y");
      String string0 = tRetEnvEvento0.getVersao();
      assertEquals("5LLw{V+Y", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVersao("");
      String string0 = tRetEnvEvento0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVerAplic("?UPk2ZEV l;F'R%A");
      String string0 = tRetEnvEvento0.getVerAplic();
      assertEquals("?UPk2ZEV l;F'R%A", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVerAplic("");
      String string0 = tRetEnvEvento0.getVerAplic();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setTpAmb("2OC%LP49ZgASZ:-Sb.");
      String string0 = tRetEnvEvento0.getTpAmb();
      assertEquals("2OC%LP49ZgASZ:-Sb.", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setTpAmb("");
      String string0 = tRetEnvEvento0.getTpAmb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      LinkedList<TretEvento> linkedList0 = new LinkedList<TretEvento>();
      tRetEnvEvento0.retEvento = (List<TretEvento>) linkedList0;
      TretEvento tretEvento0 = new TretEvento();
      linkedList0.add(tretEvento0);
      List<TretEvento> list0 = tRetEnvEvento0.getRetEvento();
      assertTrue(list0.contains(tretEvento0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setIdLote("f}");
      String string0 = tRetEnvEvento0.getIdLote();
      assertEquals("f}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setIdLote("");
      String string0 = tRetEnvEvento0.getIdLote();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.cStat = "br.com.swconsultoria.nfe.schema.retenvcce.TretEvento$InfEvento";
      String string0 = tRetEnvEvento0.getCStat();
      assertEquals("br.com.swconsultoria.nfe.schema.retenvcce.TretEvento$InfEvento", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setCStat("");
      String string0 = tRetEnvEvento0.getCStat();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setCOrgao("6B");
      String string0 = tRetEnvEvento0.getCOrgao();
      assertEquals("6B", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setCOrgao("");
      String string0 = tRetEnvEvento0.getCOrgao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      List<TretEvento> list0 = tRetEnvEvento0.getRetEvento();
      List<TretEvento> list1 = tRetEnvEvento0.getRetEvento();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getCOrgao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getXMotivo();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getTpAmb();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getIdLote();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getCStat();
      assertNull(string0);
  }
}
