/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:40:49 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.retConsReciNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.retConsReciNFe.TUfEmi;
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
      TUfEmi tUfEmi0 = TUfEmi.valueOf("CE");
      assertEquals(TUfEmi.CE, tUfEmi0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TUfEmi tUfEmi0 = TUfEmi.fromValue("CE");
      assertEquals(TUfEmi.CE, tUfEmi0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TUfEmi tUfEmi0 = TUfEmi.ES;
      String string0 = tUfEmi0.value();
      assertEquals("ES", string0);
  }
}
