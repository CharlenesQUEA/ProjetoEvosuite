/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 09:54:17 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.retEnvEpec;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.retEnvEpec.X509DataType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class X509DataType_ESTest extends X509DataType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      X509DataType x509DataType0 = new X509DataType();
      byte[] byteArray0 = new byte[0];
      x509DataType0.setX509Certificate(byteArray0);
      byte[] byteArray1 = x509DataType0.getX509Certificate();
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      X509DataType x509DataType0 = new X509DataType();
      byte[] byteArray0 = x509DataType0.getX509Certificate();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      X509DataType x509DataType0 = new X509DataType();
      byte[] byteArray0 = new byte[4];
      x509DataType0.setX509Certificate(byteArray0);
      byte[] byteArray1 = x509DataType0.getX509Certificate();
      assertSame(byteArray1, byteArray0);
  }
}
