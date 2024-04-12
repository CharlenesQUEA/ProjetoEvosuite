/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:54:15 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.eventoCancNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.eventoCancNFe.TRetEnvEvento;
import br.com.swconsultoria.nfe.schema.eventoCancNFe.TRetEvento;
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
      tRetEnvEvento0.setXMotivo("P)3X/!'xNk[*2");
      String string0 = tRetEnvEvento0.getXMotivo();
      assertEquals("P)3X/!'xNk[*2", string0);
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
      tRetEnvEvento0.setVersao("");
      String string0 = tRetEnvEvento0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setVerAplic("9z4`nb2Cd*T1I");
      String string0 = tRetEnvEvento0.getVerAplic();
      assertEquals("9z4`nb2Cd*T1I", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.verAplic = "";
      String string0 = tRetEnvEvento0.getVerAplic();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.tpAmb = "URH-uG)&'bC";
      String string0 = tRetEnvEvento0.getTpAmb();
      assertEquals("URH-uG)&'bC", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.tpAmb = "";
      String string0 = tRetEnvEvento0.getTpAmb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      List<TRetEvento> list0 = tRetEnvEvento0.getRetEvento();
      tRetEnvEvento0.retEvento = list0;
      LinkedList<TRetEvento> linkedList0 = new LinkedList<TRetEvento>();
      tRetEnvEvento0.retEvento = (List<TRetEvento>) linkedList0;
      TRetEvento tRetEvento0 = new TRetEvento();
      linkedList0.add(tRetEvento0);
      List<TRetEvento> list1 = tRetEnvEvento0.getRetEvento();
      assertTrue(list1.contains(tRetEvento0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setIdLote("d=srz<");
      String string0 = tRetEnvEvento0.getIdLote();
      assertEquals("d=srz<", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setIdLote("");
      String string0 = tRetEnvEvento0.getIdLote();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.cStat = ">";
      String string0 = tRetEnvEvento0.getCStat();
      assertEquals(">", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setCStat("");
      String string0 = tRetEnvEvento0.getCStat();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.cOrgao = "URH-uG)&'bC";
      String string0 = tRetEnvEvento0.getCOrgao();
      assertEquals("URH-uG)&'bC", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.cOrgao = "";
      String string0 = tRetEnvEvento0.getCOrgao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setTpAmb("br.com.swc4nsultoria.nfe.schema.eventoCacNe.RefernceTyp");
      assertNull(tRetEnvEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getIdLote();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getXMotivo();
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
      tRetEnvEvento0.setVersao("br.com.swc4nsultoria.nfe.schema.eventoCacNe.RefernceTyp");
      String string0 = tRetEnvEvento0.getVersao();
      assertEquals("br.com.swc4nsultoria.nfe.schema.eventoCacNe.RefernceTyp", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getCOrgao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      tRetEnvEvento0.setCOrgao(":>");
      assertNull(tRetEnvEvento0.getTpAmb());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TRetEnvEvento tRetEnvEvento0 = new TRetEnvEvento();
      String string0 = tRetEnvEvento0.getTpAmb();
      assertNull(string0);
  }
}
