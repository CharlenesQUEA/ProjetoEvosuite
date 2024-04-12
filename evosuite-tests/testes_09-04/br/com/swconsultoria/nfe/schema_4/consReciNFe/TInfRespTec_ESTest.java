/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:11:34 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.consReciNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.consReciNFe.TInfRespTec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TInfRespTec_ESTest extends TInfRespTec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.setXContato("W#IyM$9i");
      String string0 = tInfRespTec0.getXContato();
      assertEquals("W#IyM$9i", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.idCSRT = "W#IyM$9i";
      String string0 = tInfRespTec0.getIdCSRT();
      assertEquals("W#IyM$9i", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      byte[] byteArray0 = new byte[7];
      tInfRespTec0.hashCSRT = byteArray0;
      byte[] byteArray1 = tInfRespTec0.getHashCSRT();
      assertEquals(7, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      byte[] byteArray0 = new byte[0];
      tInfRespTec0.hashCSRT = byteArray0;
      byte[] byteArray1 = tInfRespTec0.getHashCSRT();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.setFone("");
      String string0 = tInfRespTec0.getFone();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.email = "8YQx";
      String string0 = tInfRespTec0.getEmail();
      assertEquals("8YQx", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.setCNPJ("");
      String string0 = tInfRespTec0.getCNPJ();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      String string0 = tInfRespTec0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      byte[] byteArray0 = tInfRespTec0.getHashCSRT();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      String string0 = tInfRespTec0.getFone();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.setCNPJ("=i8zO~Um.aFH0,Lh_Ew");
      String string0 = tInfRespTec0.getCNPJ();
      assertEquals("=i8zO~Um.aFH0,Lh_Ew", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.setFone("\"HPJ8");
      String string0 = tInfRespTec0.getFone();
      assertEquals("\"HPJ8", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      String string0 = tInfRespTec0.getCNPJ();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.setEmail("");
      String string0 = tInfRespTec0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.setXContato("");
      String string0 = tInfRespTec0.getXContato();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      String string0 = tInfRespTec0.getXContato();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      byte[] byteArray0 = new byte[7];
      tInfRespTec0.setHashCSRT(byteArray0);
      assertNull(tInfRespTec0.getIdCSRT());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      tInfRespTec0.setIdCSRT("");
      String string0 = tInfRespTec0.getIdCSRT();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TInfRespTec tInfRespTec0 = new TInfRespTec();
      String string0 = tInfRespTec0.getIdCSRT();
      assertNull(string0);
  }
}
