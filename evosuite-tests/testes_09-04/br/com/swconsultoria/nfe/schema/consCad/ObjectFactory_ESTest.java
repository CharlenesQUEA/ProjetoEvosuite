/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:42:50 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.consCad;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.consCad.ObjectFactory;
import br.com.swconsultoria.nfe.schema.consCad.TConsCad;
import br.com.swconsultoria.nfe.schema.consCad.TEndereco;
import br.com.swconsultoria.nfe.schema.consCad.TRetConsCad;
import javax.xml.bind.JAXBElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectFactory_ESTest extends ObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TConsCad.InfCons tConsCad_InfCons0 = objectFactory0.createTConsCadInfCons();
      assertNull(tConsCad_InfCons0.getCPF());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetConsCad tRetConsCad0 = objectFactory0.createTRetConsCad();
      assertNull(tRetConsCad0.getVersao());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetConsCad.InfCons.InfCad tRetConsCad_InfCons_InfCad0 = objectFactory0.createTRetConsCadInfConsInfCad();
      assertNull(tRetConsCad_InfCons_InfCad0.getIEUnica());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TConsCad tConsCad0 = objectFactory0.createTConsCad();
      JAXBElement<TConsCad> jAXBElement0 = objectFactory0.createConsCad(tConsCad0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetConsCad.InfCons tRetConsCad_InfCons0 = objectFactory0.createTRetConsCadInfCons();
      assertNull(tRetConsCad_InfCons0.getIE());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEndereco tEndereco0 = objectFactory0.createTEndereco();
      assertNull(tEndereco0.getCMun());
  }
}
