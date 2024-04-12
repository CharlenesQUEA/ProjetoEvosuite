/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 12:06:50 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.retEnviNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.retEnviNFe.TUf;
import br.com.swconsultoria.nfe.schema_4.retEnviNFe.TVeiculo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TVeiculo_ESTest extends TVeiculo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      TUf tUf0 = TUf.DF;
      tVeiculo0.setUF(tUf0);
      TUf tUf1 = tVeiculo0.getUF();
      assertEquals(TUf.DF, tUf1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      tVeiculo0.rntc = "r[n{:CN$.{\"V";
      String string0 = tVeiculo0.getRNTC();
      assertEquals("r[n{:CN$.{\"V", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      tVeiculo0.rntc = "";
      String string0 = tVeiculo0.getRNTC();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      tVeiculo0.setPlaca("EOu}/2^ME)``");
      String string0 = tVeiculo0.getPlaca();
      assertEquals("EOu}/2^ME)``", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      tVeiculo0.setRNTC("PE");
      assertNull(tVeiculo0.getPlaca());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      String string0 = tVeiculo0.getPlaca();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      tVeiculo0.setPlaca("");
      String string0 = tVeiculo0.getPlaca();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      tVeiculo0.getUF();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TVeiculo tVeiculo0 = new TVeiculo();
      String string0 = tVeiculo0.getRNTC();
      assertNull(string0);
  }
}
