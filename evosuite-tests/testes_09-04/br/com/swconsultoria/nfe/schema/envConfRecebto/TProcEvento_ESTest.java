/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:43:15 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envConfRecebto;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envConfRecebto.TEvento;
import br.com.swconsultoria.nfe.schema.envConfRecebto.TProcEvento;
import br.com.swconsultoria.nfe.schema.envConfRecebto.TretEvento;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TProcEvento_ESTest extends TProcEvento_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      TEvento tEvento0 = new TEvento();
      tProcEvento0.setEvento(tEvento0);
      assertNull(tEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      tProcEvento0.versao = "9HC0aLR>Mp-hJc *V(";
      String string0 = tProcEvento0.getVersao();
      assertEquals("9HC0aLR>Mp-hJc *V(", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      tProcEvento0.setVersao("");
      String string0 = tProcEvento0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      TretEvento tretEvento0 = new TretEvento();
      tProcEvento0.retEvento = tretEvento0;
      TretEvento tretEvento1 = tProcEvento0.getRetEvento();
      assertSame(tretEvento1, tretEvento0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      TEvento tEvento0 = new TEvento();
      tProcEvento0.evento = tEvento0;
      TEvento tEvento1 = tProcEvento0.getEvento();
      assertNull(tEvento1.getVersao());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      String string0 = tProcEvento0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      TretEvento tretEvento0 = new TretEvento();
      tProcEvento0.setRetEvento(tretEvento0);
      assertNull(tProcEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      TEvento tEvento0 = tProcEvento0.getEvento();
      assertNull(tEvento0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TProcEvento tProcEvento0 = new TProcEvento();
      TretEvento tretEvento0 = tProcEvento0.getRetEvento();
      assertNull(tretEvento0);
  }
}
