/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:33:37 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.retConsSitNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.retConsSitNFe.SignatureType;
import br.com.swconsultoria.nfe.schema_4.retConsSitNFe.TRetCancNFe;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TRetCancNFe_ESTest extends TRetCancNFe_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setId("br.com.swconsultoria.nfe.schema_4.retConsSitNFe.TRetCancNFe$InfCanc");
      assertNull(tRetCancNFe_InfCanc0.getCUF());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.id = ";9H(4(";
      String string0 = tRetCancNFe_InfCanc0.getId();
      assertEquals(";9H(4(", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setNProt("");
      String string0 = tRetCancNFe_InfCanc0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setNProt("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
      String string0 = tRetCancNFe_InfCanc0.getNProt();
      assertEquals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.chNFe = "h[M";
      String string0 = tRetCancNFe_InfCanc0.getChNFe();
      assertEquals("h[M", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setCUF("");
      String string0 = tRetCancNFe_InfCanc0.getCUF();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setVerAplic("br.com.swconsultoria.nfe.schema_4.retConsSitNFe.TRetCancNFe$InfCanc");
      String string0 = tRetCancNFe_InfCanc0.getCUF();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setXMotivo("");
      assertNull(tRetCancNFe_InfCanc0.getVerAplic());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.xMotivo = "tnXf#dnI%iO@=x";
      String string0 = tRetCancNFe_InfCanc0.getXMotivo();
      assertEquals("tnXf#dnI%iO@=x", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setCStat("tnXf#dnI%iO@=x");
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      tRetCancNFe0.infCanc = tRetCancNFe_InfCanc0;
      String string0 = tRetCancNFe0.infCanc.getCStat();
      assertEquals("tnXf#dnI%iO@=x", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setChNFe("");
      String string0 = tRetCancNFe_InfCanc0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setNProt("");
      String string0 = tRetCancNFe_InfCanc0.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setTpAmb("");
      String string0 = tRetCancNFe_InfCanc0.getTpAmb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      tRetCancNFe0.setVersao("http://www.w3.org/2000/09/xmldsig#sha1");
      String string0 = tRetCancNFe0.getVersao();
      assertEquals("http://www.w3.org/2000/09/xmldsig#sha1", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      tRetCancNFe0.setVersao("");
      String string0 = tRetCancNFe0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      SignatureType signatureType0 = new SignatureType();
      tRetCancNFe0.setSignature(signatureType0);
      SignatureType signatureType1 = tRetCancNFe0.getSignature();
      assertNull(signatureType1.getId());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe0.infCanc = tRetCancNFe_InfCanc0;
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc1 = tRetCancNFe0.getInfCanc();
      assertNull(tRetCancNFe_InfCanc1.getNProt());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      XMLGregorianCalendar xMLGregorianCalendar0 = tRetCancNFe_InfCanc0.getDhRecbto();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setDhRecbto((XMLGregorianCalendar) null);
      assertNull(tRetCancNFe_InfCanc0.getVerAplic());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      tRetCancNFe_InfCanc0.setVerAplic("{*+q'Y8JM9`");
      String string0 = tRetCancNFe_InfCanc0.getVerAplic();
      assertEquals("{*+q'Y8JM9`", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = new TRetCancNFe.InfCanc();
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      tRetCancNFe0.setInfCanc(tRetCancNFe_InfCanc0);
      assertNull(tRetCancNFe_InfCanc0.getVerAplic());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      String string0 = tRetCancNFe0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = tRetCancNFe0.getInfCanc();
      assertNull(tRetCancNFe_InfCanc0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TRetCancNFe tRetCancNFe0 = new TRetCancNFe();
      SignatureType signatureType0 = tRetCancNFe0.getSignature();
      assertNull(signatureType0);
  }
}
