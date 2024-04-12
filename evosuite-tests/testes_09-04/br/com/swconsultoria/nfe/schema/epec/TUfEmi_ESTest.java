/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 10:13:34 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.epec;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.epec.TUfEmi;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TUfEmi_ESTest extends TUfEmi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TUfEmi[] tUfEmiArray0 = TUfEmi.values();
      assertEquals(27, tUfEmiArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TUfEmi tUfEmi0 = TUfEmi.valueOf("RR");
      assertEquals(TUfEmi.RR, tUfEmi0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TUfEmi tUfEmi0 = TUfEmi.fromValue("RR");
      assertEquals(TUfEmi.RR, tUfEmi0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TUfEmi tUfEmi0 = TUfEmi.PE;
      String string0 = tUfEmi0.value();
      assertEquals("PE", string0);
  }
}
