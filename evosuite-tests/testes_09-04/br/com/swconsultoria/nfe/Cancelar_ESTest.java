/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 11:47:31 GMT 2024
 */

package br.com.swconsultoria.nfe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.com.swconsultoria.nfe.Cancelar;
import br.com.swconsultoria.nfe.dom.ConfiguracoesNfe;
import br.com.swconsultoria.nfe.dom.enuns.DocumentoEnum;
import br.com.swconsultoria.nfe.schema.envEventoCancSubst.TEnvEvento;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Cancelar_ESTest extends Cancelar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      // Undeclared exception!
      try { 
        Cancelar.eventoCancelamentoSubstituicao((ConfiguracoesNfe) null, tEnvEvento0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.Cancelar", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConfiguracoesNfe configuracoesNfe0 = new ConfiguracoesNfe();
      br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEnvEvento tEnvEvento0 = new br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEnvEvento();
      DocumentoEnum documentoEnum0 = DocumentoEnum.NFE;
      // Undeclared exception!
      try { 
        Cancelar.eventoCancelamento(configuracoesNfe0, tEnvEvento0, true, documentoEnum0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/axis2/client/Stub
         //
         verifyException("br.com.swconsultoria.nfe.Cancelar", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEnvEvento tEnvEvento0 = new br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEnvEvento();
      DocumentoEnum documentoEnum0 = DocumentoEnum.NFE;
      // Undeclared exception!
      try { 
        Cancelar.eventoCancelamento((ConfiguracoesNfe) null, tEnvEvento0, true, documentoEnum0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.Cancelar", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConfiguracoesNfe configuracoesNfe0 = new ConfiguracoesNfe();
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      // Undeclared exception!
      try { 
        Cancelar.eventoCancelamentoSubstituicao(configuracoesNfe0, tEnvEvento0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/axis2/client/Stub
         //
         verifyException("br.com.swconsultoria.nfe.Cancelar", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Cancelar cancelar0 = new Cancelar();
  }
}
