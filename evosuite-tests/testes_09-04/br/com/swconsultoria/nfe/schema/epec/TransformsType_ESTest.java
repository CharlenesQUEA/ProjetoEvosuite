/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 11:57:05 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.epec;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.epec.TransformType;
import br.com.swconsultoria.nfe.schema.epec.TransformsType;
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
      transformsType0.transform = (List<TransformType>) linkedList0;
      linkedList0.add((TransformType) null);
      List<TransformType> list0 = transformsType0.getTransform();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TransformsType transformsType0 = new TransformsType();
      List<TransformType> list0 = transformsType0.getTransform();
      List<TransformType> list1 = transformsType0.getTransform();
      assertSame(list1, list0);
  }
}
