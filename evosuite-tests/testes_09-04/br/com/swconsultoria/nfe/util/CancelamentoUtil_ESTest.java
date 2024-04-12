/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 05:43:33 GMT 2024
 */

package br.com.swconsultoria.nfe.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.com.swconsultoria.nfe.dom.ConfiguracoesNfe;
import br.com.swconsultoria.nfe.dom.Evento;
import br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEnvEvento;
import br.com.swconsultoria.nfe.schema.envEventoCancNFe.TRetEvento;
import br.com.swconsultoria.nfe.util.CancelamentoUtil;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CancelamentoUtil_ESTest extends CancelamentoUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Evento> linkedList0 = new LinkedList<Evento>();
      linkedList0.add((Evento) null);
      linkedList0.push((Evento) null);
      Evento evento0 = new Evento();
      linkedList0.add(evento0);
      linkedList0.add((Evento) null);
      linkedList0.add(evento0);
      linkedList0.offerLast(evento0);
      linkedList0.add(evento0);
      linkedList0.add(evento0);
      linkedList0.add(evento0);
      linkedList0.add(evento0);
      linkedList0.addLast((Evento) null);
      linkedList0.add(evento0);
      linkedList0.add((Evento) null);
      linkedList0.add(evento0);
      linkedList0.add(evento0);
      linkedList0.addLast((Evento) null);
      linkedList0.add((Evento) null);
      linkedList0.add(evento0);
      linkedList0.push((Evento) null);
      linkedList0.addLast(evento0);
      // Undeclared exception!
      try { 
        CancelamentoUtil.montaCancelamento((List<Evento>) linkedList0, (ConfiguracoesNfe) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.util.CancelamentoUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Evento> linkedList0 = new LinkedList<Evento>();
      linkedList0.add((Evento) null);
      // Undeclared exception!
      try { 
        CancelamentoUtil.montaCancelamento((List<Evento>) linkedList0, (ConfiguracoesNfe) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.util.CancelamentoUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Evento> linkedList0 = new LinkedList<Evento>();
      TEnvEvento tEnvEvento0 = CancelamentoUtil.montaCancelamento((List<Evento>) linkedList0, (ConfiguracoesNfe) null);
      assertEquals("1.00", tEnvEvento0.getVersao());
      assertEquals("1", tEnvEvento0.getIdLote());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Evento> linkedList0 = new LinkedList<Evento>();
      linkedList0.add((Evento) null);
      linkedList0.push((Evento) null);
      Evento evento0 = new Evento();
      linkedList0.add(evento0);
      linkedList0.add((Evento) null);
      linkedList0.add(evento0);
      linkedList0.add((Evento) null);
      linkedList0.offerLast(evento0);
      linkedList0.add(evento0);
      linkedList0.add(evento0);
      linkedList0.add(evento0);
      linkedList0.add(evento0);
      linkedList0.addLast((Evento) null);
      linkedList0.add(evento0);
      linkedList0.add((Evento) null);
      linkedList0.add(evento0);
      linkedList0.add(evento0);
      linkedList0.addLast((Evento) null);
      linkedList0.add((Evento) null);
      linkedList0.add(evento0);
      linkedList0.push((Evento) null);
      linkedList0.addLast(evento0);
      try { 
        CancelamentoUtil.montaCancelamento((List<Evento>) linkedList0, (ConfiguracoesNfe) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Podem ser enviados no m\u00E1ximo 20 eventos no Lote.
         //
         verifyException("br.com.swconsultoria.nfe.util.CancelamentoUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConfiguracoesNfe configuracoesNfe0 = new ConfiguracoesNfe();
      TRetEvento tRetEvento0 = new TRetEvento();
      TEnvEvento tEnvEvento0 = new TEnvEvento();
      // Undeclared exception!
      try { 
        CancelamentoUtil.criaProcEventoCancelamento(configuracoesNfe0, tEnvEvento0, tRetEvento0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.util.ConfiguracoesUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Evento evento0 = new Evento();
      ConfiguracoesNfe configuracoesNfe0 = new ConfiguracoesNfe();
      // Undeclared exception!
      try { 
        CancelamentoUtil.montaCancelamento(evento0, configuracoesNfe0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.util.CancelamentoUtil", e);
      }
  }
}
