/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 05:24:12 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.retEnviNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.retEnviNFe.TConsReciNFe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TConsReciNFe_ESTest extends TConsReciNFe_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      tConsReciNFe0.setVersao("br.com.swconsultoria.nfe.schema_4.retEnviNFe.TConsReciNFe");
      String string0 = tConsReciNFe0.getVersao();
      assertEquals("br.com.swconsultoria.nfe.schema_4.retEnviNFe.TConsReciNFe", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      tConsReciNFe0.versao = "";
      String string0 = tConsReciNFe0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      tConsReciNFe0.setTpAmb("l pIv}4eIM37x");
      String string0 = tConsReciNFe0.getTpAmb();
      assertEquals("l pIv}4eIM37x", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      tConsReciNFe0.setTpAmb("");
      String string0 = tConsReciNFe0.getTpAmb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      tConsReciNFe0.nRec = "ej=\"Yl)nTqG5`?Qt";
      String string0 = tConsReciNFe0.getNRec();
      assertEquals("ej=\"Yl)nTqG5`?Qt", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      tConsReciNFe0.setNRec("");
      String string0 = tConsReciNFe0.getNRec();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      String string0 = tConsReciNFe0.getNRec();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      String string0 = tConsReciNFe0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TConsReciNFe tConsReciNFe0 = new TConsReciNFe();
      String string0 = tConsReciNFe0.getTpAmb();
      assertNull(string0);
  }
}
