/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:11:20 GMT 2024
 */

package br.com.swconsultoria.nfe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.com.swconsultoria.nfe.Epec;
import br.com.swconsultoria.nfe.dom.ConfiguracoesNfe;
import br.com.swconsultoria.nfe.schema.envEpec.TEnvEvento;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Epec_ESTest extends Epec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      // Undeclared exception!
      try { 
        Epec.eventoEpec((ConfiguracoesNfe) null, tEnvEvento0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.Epec", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Epec epec0 = new Epec();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConfiguracoesNfe configuracoesNfe0 = new ConfiguracoesNfe();
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      // Undeclared exception!
      try { 
        Epec.eventoEpec(configuracoesNfe0, tEnvEvento0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/axis2/client/Stub
         //
         verifyException("br.com.swconsultoria.nfe.Epec", e);
      }
  }
}
