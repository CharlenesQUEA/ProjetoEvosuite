/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 09:46:14 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envcce;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envcce.SignatureValueType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SignatureValueType_ESTest extends SignatureValueType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      byte[] byteArray0 = new byte[5];
      signatureValueType0.value = byteArray0;
      byte[] byteArray1 = signatureValueType0.getValue();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      byte[] byteArray0 = new byte[0];
      signatureValueType0.setValue(byteArray0);
      byte[] byteArray1 = signatureValueType0.getValue();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      signatureValueType0.id = "";
      signatureValueType0.id = "hwr+'hyM";
      String string0 = signatureValueType0.getId();
      assertEquals("hwr+'hyM", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      String string0 = signatureValueType0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      signatureValueType0.setId("");
      String string0 = signatureValueType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      byte[] byteArray0 = signatureValueType0.getValue();
      assertNull(byteArray0);
  }
}
