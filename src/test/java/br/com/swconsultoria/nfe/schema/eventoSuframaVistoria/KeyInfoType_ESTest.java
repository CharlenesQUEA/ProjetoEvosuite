/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:01:04 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.eventoSuframaVistoria;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.KeyInfoType;
import br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.X509DataType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyInfoType_ESTest extends KeyInfoType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeyInfoType keyInfoType0 = new KeyInfoType();
      keyInfoType0.id = "";
      String string0 = keyInfoType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeyInfoType keyInfoType0 = new KeyInfoType();
      X509DataType x509DataType0 = keyInfoType0.getX509Data();
      assertNull(x509DataType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeyInfoType keyInfoType0 = new KeyInfoType();
      X509DataType x509DataType0 = new X509DataType();
      keyInfoType0.setX509Data(x509DataType0);
      X509DataType x509DataType1 = keyInfoType0.getX509Data();
      assertSame(x509DataType1, x509DataType0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KeyInfoType keyInfoType0 = new KeyInfoType();
      keyInfoType0.setId("br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.X509DataType");
      String string0 = keyInfoType0.getId();
      assertEquals("br.com.swconsultoria.nfe.schema.eventoSuframaVistoria.X509DataType", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KeyInfoType keyInfoType0 = new KeyInfoType();
      String string0 = keyInfoType0.getId();
      assertNull(string0);
  }
}
