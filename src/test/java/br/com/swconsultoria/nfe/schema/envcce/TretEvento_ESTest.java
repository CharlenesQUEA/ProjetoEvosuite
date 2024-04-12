/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 07:54:34 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envcce;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envcce.SignatureType;
import br.com.swconsultoria.nfe.schema.envcce.TretEvento;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TretEvento_ESTest extends TretEvento_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setId("&l|M");
      String string0 = tretEvento_InfEvento0.getId();
      assertEquals("&l|M", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setNProt(":@q)ZhF3J8kNr:Ps");
      String string0 = tretEvento_InfEvento0.getNProt();
      assertEquals(":@q)ZhF3J8kNr:Ps", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setDhRegEvento("");
      String string0 = tretEvento_InfEvento0.getDhRegEvento();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setEmailDest("uPaw(OLe1>N(<QP");
      String string0 = tretEvento_InfEvento0.getEmailDest();
      assertEquals("uPaw(OLe1>N(<QP", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setCPFDest("&l|M");
      String string0 = tretEvento_InfEvento0.getCPFDest();
      assertEquals("&l|M", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setCNPJDest("");
      String string0 = tretEvento_InfEvento0.getCNPJDest();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setNSeqEvento("ep=%dOP3lg0^x`Yhn&");
      String string0 = tretEvento_InfEvento0.getNSeqEvento();
      assertEquals("ep=%dOP3lg0^x`Yhn&", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento0.infEvento = tretEvento_InfEvento0;
      tretEvento_InfEvento0.setNProt(":@q)ZhF3J8kNr:Ps");
      String string0 = tretEvento0.infEvento.getNSeqEvento();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setXEvento("<J`]");
      String string0 = tretEvento_InfEvento0.getXEvento();
      assertEquals("<J`]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento0.infEvento = tretEvento_InfEvento0;
      tretEvento0.infEvento.setTpEvento("br.com.swconsultoria.nfe.schema.envcce.SignatureValueType");
      String string0 = tretEvento0.infEvento.getTpEvento();
      assertEquals("br.com.swconsultoria.nfe.schema.envcce.SignatureValueType", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setChNFe("");
      String string0 = tretEvento_InfEvento0.getChNFe();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setCStat("~qE");
      String string0 = tretEvento_InfEvento0.getChNFe();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setTpAmb("ZB#r%");
      String string0 = tretEvento_InfEvento0.getChNFe();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setXMotivo("ZB#r%");
      String string0 = tretEvento_InfEvento0.getChNFe();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setXMotivo("ZzJ]|~bdz_]S^w");
      String string0 = tretEvento_InfEvento0.getXMotivo();
      assertEquals("ZzJ]|~bdz_]S^w", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setCStat("");
      String string0 = tretEvento_InfEvento0.getCStat();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setCOrgao("&l|M");
      String string0 = tretEvento_InfEvento0.getChNFe();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.cOrgao = "";
      String string0 = tretEvento_InfEvento0.getCOrgao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.verAplic = "";
      String string0 = tretEvento_InfEvento0.getVerAplic();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setTpAmb("rwb>Ma67*gH<em$Q12S");
      String string0 = tretEvento_InfEvento0.getTpAmb();
      assertEquals("rwb>Ma67*gH<em$Q12S", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      tretEvento0.versao = "";
      String string0 = tretEvento0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      SignatureType signatureType0 = new SignatureType();
      tretEvento0.setSignature(signatureType0);
      SignatureType signatureType1 = tretEvento0.getSignature();
      assertNull(signatureType1.getId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento0.infEvento = tretEvento_InfEvento0;
      TretEvento.InfEvento tretEvento_InfEvento1 = tretEvento0.getInfEvento();
      assertNull(tretEvento_InfEvento1.getXEvento());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      String string0 = tretEvento0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      TretEvento.InfEvento tretEvento_InfEvento0 = tretEvento0.getInfEvento();
      assertNull(tretEvento_InfEvento0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      SignatureType signatureType0 = tretEvento0.getSignature();
      assertNull(signatureType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      TretEvento tretEvento0 = new TretEvento();
      tretEvento0.setInfEvento(tretEvento_InfEvento0);
      assertNull(tretEvento_InfEvento0.getNProt());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TretEvento tretEvento0 = new TretEvento();
      tretEvento0.setVersao("5gNe`%5o)k^8 ");
      String string0 = tretEvento0.getVersao();
      assertEquals("5gNe`%5o)k^8 ", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TretEvento.InfEvento tretEvento_InfEvento0 = new TretEvento.InfEvento();
      tretEvento_InfEvento0.setVerAplic("");
      String string0 = tretEvento_InfEvento0.getChNFe();
      assertNull(string0);
  }
}
