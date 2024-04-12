/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:15:23 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.resnfe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.resnfe.SignatureValueType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SignatureValueType_ESTest extends SignatureValueType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      byte[] byteArray0 = new byte[8];
      signatureValueType0.value = byteArray0;
      byte[] byteArray1 = signatureValueType0.getValue();
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      signatureValueType0.id = "GT7Bvqi}#.2ic+OH";
      String string0 = signatureValueType0.getId();
      assertEquals("GT7Bvqi}#.2ic+OH", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      signatureValueType0.setId("");
      String string0 = signatureValueType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      byte[] byteArray0 = signatureValueType0.getValue();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      byte[] byteArray0 = new byte[0];
      signatureValueType0.setValue(byteArray0);
      byte[] byteArray1 = signatureValueType0.getValue();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SignatureValueType signatureValueType0 = new SignatureValueType();
      String string0 = signatureValueType0.getId();
      assertNull(string0);
  }
}
