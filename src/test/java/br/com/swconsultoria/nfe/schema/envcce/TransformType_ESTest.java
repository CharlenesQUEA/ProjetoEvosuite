/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:04:51 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envcce;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envcce.TransformType;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransformType_ESTest extends TransformType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransformType transformType0 = new TransformType();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      transformType0.xPath = (List<String>) linkedList0;
      linkedList0.add("");
      List<String> list0 = transformType0.getXPath();
      assertTrue(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TransformType transformType0 = new TransformType();
      transformType0.setAlgorithm("@");
      String string0 = transformType0.getAlgorithm();
      assertEquals("@", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TransformType transformType0 = new TransformType();
      transformType0.algorithm = "";
      String string0 = transformType0.getAlgorithm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TransformType transformType0 = new TransformType();
      transformType0.getXPath();
      List<String> list0 = transformType0.getXPath();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TransformType transformType0 = new TransformType();
      String string0 = transformType0.getAlgorithm();
      assertNull(string0);
  }
}
