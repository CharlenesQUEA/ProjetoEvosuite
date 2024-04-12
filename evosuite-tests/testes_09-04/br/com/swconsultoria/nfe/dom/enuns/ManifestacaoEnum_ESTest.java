/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:23:41 GMT 2024
 */

package br.com.swconsultoria.nfe.dom.enuns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.com.swconsultoria.nfe.dom.enuns.ManifestacaoEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ManifestacaoEnum_ESTest extends ManifestacaoEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ManifestacaoEnum[] manifestacaoEnumArray0 = ManifestacaoEnum.values();
      assertEquals(4, manifestacaoEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ManifestacaoEnum manifestacaoEnum0 = ManifestacaoEnum.valueOf("DESCONHECIMENTO_DA_OPERACAO");
      assertEquals("Desconhecimento da Opera\u00E7\u00E3o", manifestacaoEnum0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ManifestacaoEnum.getTipo((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.dom.enuns.ManifestacaoEnum", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ManifestacaoEnum.getTipo("3)ly}'");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ManifestacaoEnum manifestacaoEnum0 = ManifestacaoEnum.getTipo("210210");
      assertEquals(ManifestacaoEnum.CIENCIA_DA_OPERACAO, manifestacaoEnum0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ManifestacaoEnum manifestacaoEnum0 = ManifestacaoEnum.getTipo("210200");
      assertEquals(ManifestacaoEnum.CONFIRMACAO_DA_OPERACAO, manifestacaoEnum0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ManifestacaoEnum manifestacaoEnum0 = ManifestacaoEnum.getTipo("210220");
      String string0 = manifestacaoEnum0.getValor();
      assertEquals("Desconhecimento da Operacao", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ManifestacaoEnum manifestacaoEnum0 = ManifestacaoEnum.CIENCIA_DA_OPERACAO;
      String string0 = manifestacaoEnum0.getCodigo();
      assertEquals("210210", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ManifestacaoEnum manifestacaoEnum0 = ManifestacaoEnum.getTipo("210240");
      String string0 = manifestacaoEnum0.getDescricao();
      assertEquals("Opera\u00E7\u00E3o n\u00E3o Realizada", string0);
  }
}
