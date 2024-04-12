/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 05:56:32 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.eventoSuframaVistoria;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.TUf;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TUf_ESTest extends TUf_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TUf[] tUfArray0 = TUf.values();
      assertEquals(28, tUfArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TUf tUf0 = TUf.valueOf("PR");
      assertEquals(TUf.PR, tUf0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TUf tUf0 = TUf.fromValue("RR");
      assertEquals(TUf.RR, tUf0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TUf tUf0 = TUf.RN;
      String string0 = tUf0.value();
      assertEquals("RN", string0);
  }
}
