/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 11:07:55 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.retdistdfeint;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.retdistdfeint.ObjectFactory;
import br.com.swconsultoria.nfe.schema.retdistdfeint.RetDistDFeInt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectFactory_ESTest extends ObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      RetDistDFeInt retDistDFeInt0 = objectFactory0.createRetDistDFeInt();
      assertNull(retDistDFeInt0.getDhResp());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      RetDistDFeInt.LoteDistDFeInt.DocZip retDistDFeInt_LoteDistDFeInt_DocZip0 = objectFactory0.createRetDistDFeIntLoteDistDFeIntDocZip();
      assertNull(retDistDFeInt_LoteDistDFeInt_DocZip0.getNSU());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      RetDistDFeInt.LoteDistDFeInt retDistDFeInt_LoteDistDFeInt0 = objectFactory0.createRetDistDFeIntLoteDistDFeInt();
      assertNotNull(retDistDFeInt_LoteDistDFeInt0);
  }
}
