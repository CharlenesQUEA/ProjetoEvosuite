/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 10:40:43 GMT 2024
 */

package br.com.swconsultoria.nfe.dom.enuns;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.dom.enuns.ServicosEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServicosEnum_ESTest extends ServicosEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServicosEnum[] servicosEnumArray0 = ServicosEnum.values();
      assertEquals(16, servicosEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServicosEnum servicosEnum0 = ServicosEnum.valueOf("STATUS_SERVICO");
      assertEquals("consStatServ_v4.00.xsd", servicosEnum0.getXsd());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServicosEnum servicosEnum0 = ServicosEnum.URL_QRCODE;
      String string0 = servicosEnum0.getXsd();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ServicosEnum servicosEnum0 = ServicosEnum.MANIFESTACAO;
      String string0 = servicosEnum0.getServico();
      assertEquals("recepcaoevento_4.00", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServicosEnum servicosEnum0 = ServicosEnum.MANIFESTACAO;
      String string0 = servicosEnum0.getXsd();
      assertEquals("envConfRecebto_v1.00.xsd", string0);
  }
}
