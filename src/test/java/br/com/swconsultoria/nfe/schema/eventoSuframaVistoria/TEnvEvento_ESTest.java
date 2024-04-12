/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:16:43 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.eventoSuframaVistoria;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.TEnvEvento;
import br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.TEvento;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TEnvEvento_ESTest extends TEnvEvento_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      tEnvEvento0.setVersao("$w_W\"^");
      String string0 = tEnvEvento0.getVersao();
      assertEquals("$w_W\"^", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      tEnvEvento0.versao = "";
      String string0 = tEnvEvento0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      tEnvEvento0.setIdLote("br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.TEnvEvento");
      String string0 = tEnvEvento0.getIdLote();
      assertEquals("br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.TEnvEvento", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      tEnvEvento0.setIdLote("");
      String string0 = tEnvEvento0.getIdLote();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      LinkedList<TEvento> linkedList0 = new LinkedList<TEvento>();
      tEnvEvento0.evento = (List<TEvento>) linkedList0;
      TEvento tEvento0 = new TEvento();
      linkedList0.addFirst(tEvento0);
      List<TEvento> list0 = tEnvEvento0.getEvento();
      assertTrue(list0.contains(tEvento0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      tEnvEvento0.getEvento();
      List<TEvento> list0 = tEnvEvento0.getEvento();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      String string0 = tEnvEvento0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      String string0 = tEnvEvento0.getIdLote();
      assertNull(string0);
  }
}
