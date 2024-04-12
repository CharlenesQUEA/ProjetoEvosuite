/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:29:00 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envcce;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envcce.TransformType;
import br.com.swconsultoria.nfe.schema.envcce.TransformsType;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransformsType_ESTest extends TransformsType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransformsType transformsType0 = new TransformsType();
      LinkedList<TransformType> linkedList0 = new LinkedList<TransformType>();
      TransformType transformType0 = new TransformType();
      linkedList0.add(transformType0);
      transformsType0.transform = (List<TransformType>) linkedList0;
      List<TransformType> list0 = transformsType0.getTransform();
      assertTrue(list0.contains(transformType0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TransformsType transformsType0 = new TransformsType();
      transformsType0.getTransform();
      List<TransformType> list0 = transformsType0.getTransform();
      assertEquals(0, list0.size());
  }
}
