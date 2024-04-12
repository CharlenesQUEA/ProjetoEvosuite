/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:47:30 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.retEnvEpec;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.retEnvEpec.TransformType;
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
      List<String> list0 = transformType0.getXPath();
      transformType0.xPath = list0;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offer("gFaN%`f");
      transformType0.xPath = (List<String>) linkedList0;
      List<String> list1 = transformType0.getXPath();
      assertTrue(list1.contains("gFaN%`f"));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TransformType transformType0 = new TransformType();
      transformType0.algorithm = null;
      transformType0.algorithm = "G}<$wF>TU~c$";
      String string0 = transformType0.getAlgorithm();
      assertEquals("G}<$wF>TU~c$", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TransformType transformType0 = new TransformType();
      transformType0.setAlgorithm("");
      String string0 = transformType0.getAlgorithm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TransformType transformType0 = new TransformType();
      String string0 = transformType0.getAlgorithm();
      assertNull(string0);
  }
}
