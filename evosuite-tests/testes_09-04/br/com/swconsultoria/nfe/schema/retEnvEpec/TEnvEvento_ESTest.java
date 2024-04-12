/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 08:30:13 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.retEnvEpec;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.retEnvEpec.TEnvEvento;
import br.com.swconsultoria.nfe.schema.retEnvEpec.TEvento;
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
      tEnvEvento0.setVersao("D$D]");
      String string0 = tEnvEvento0.getVersao();
      assertEquals("D$D]", string0);
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
      tEnvEvento0.setIdLote("zI:a5eo&D=.");
      String string0 = tEnvEvento0.getIdLote();
      assertEquals("zI:a5eo&D=.", string0);
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
      linkedList0.add(tEvento0);
      List<TEvento> list0 = tEnvEvento0.getEvento();
      assertTrue(list0.contains(tEvento0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      List<TEvento> list0 = tEnvEvento0.getEvento();
      List<TEvento> list1 = tEnvEvento0.getEvento();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      String string0 = tEnvEvento0.getIdLote();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      String string0 = tEnvEvento0.getVersao();
      assertNull(string0);
  }
}
