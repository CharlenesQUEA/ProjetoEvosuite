/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:27:23 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.consReciNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.consReciNFe.SignatureType;
import br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TProtNFe_ESTest extends TProtNFe_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.id = "\"q8T,neQr";
      String string0 = tProtNFe_InfProt0.getId();
      assertEquals("\"q8T,neQr", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setXMsg("br.com.swconsultoria.nfe.schema_4.consReciNFe.SignedInfoType");
      String string0 = tProtNFe_InfProt0.getXMsg();
      assertEquals("br.com.swconsultoria.nfe.schema_4.consReciNFe.SignedInfoType", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setNProt("&A5Y");
      String string0 = tProtNFe_InfProt0.getXMsg();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.cMsg = "{KOg-?C1SwK57";
      String string0 = tProtNFe_InfProt0.getCMsg();
      assertEquals("{KOg-?C1SwK57", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setXMotivo("");
      String string0 = tProtNFe_InfProt0.getXMotivo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setCMsg("");
      String string0 = tProtNFe_InfProt0.getXMotivo();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setXMsg("}");
      String string0 = tProtNFe_InfProt0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setTpAmb("}");
      String string0 = tProtNFe_InfProt0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe0.setInfProt(tProtNFe_InfProt0);
      tProtNFe_InfProt0.setXMotivo("_xrJf,qjXY~D`tY");
      String string0 = tProtNFe0.infProt.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setId("");
      String string0 = tProtNFe_InfProt0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.chNFe = "br.com.swconsultoria.nfe.schema_4.consReciNFe.SignedInfoType$CanonicalizationMethod";
      String string0 = tProtNFe_InfProt0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setDhRecbto("}");
      String string0 = tProtNFe_InfProt0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.verAplic = "}";
      String string0 = tProtNFe_InfProt0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setNProt("&A5Y");
      tProtNFe0.setInfProt(tProtNFe_InfProt0);
      String string0 = tProtNFe0.infProt.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.cMsg = "";
      String string0 = tProtNFe_InfProt0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      TProtNFe tProtNFe0 = new TProtNFe();
      tProtNFe0.infProt = tProtNFe_InfProt0;
      tProtNFe0.infProt.setNProt("br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt");
      String string0 = tProtNFe0.infProt.getNProt();
      assertEquals("br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.dhRecbto = "bkz2`x";
      String string0 = tProtNFe_InfProt0.getDhRecbto();
      assertEquals("bkz2`x", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.chNFe = "";
      String string0 = tProtNFe_InfProt0.getChNFe();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.xMsg = "br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt";
      String string0 = tProtNFe_InfProt0.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setCStat("");
      String string0 = tProtNFe_InfProt0.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setTpAmb("br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt");
      String string0 = tProtNFe_InfProt0.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe0.infProt = tProtNFe_InfProt0;
      tProtNFe0.infProt.setXMotivo("br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt");
      String string0 = tProtNFe0.infProt.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe0.infProt = tProtNFe_InfProt0;
      tProtNFe_InfProt0.setId("kHYE}f");
      String string0 = tProtNFe0.infProt.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe0.infProt = tProtNFe_InfProt0;
      tProtNFe0.infProt.setChNFe("br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt");
      String string0 = tProtNFe0.infProt.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe0.infProt = tProtNFe_InfProt0;
      tProtNFe_InfProt0.setDhRecbto("br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt");
      String string0 = tProtNFe0.infProt.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setNProt("br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt");
      String string0 = tProtNFe_InfProt0.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe0.infProt = tProtNFe_InfProt0;
      tProtNFe_InfProt0.setCMsg("");
      String string0 = tProtNFe0.infProt.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.cMsg = "";
      String string0 = tProtNFe_InfProt0.getTpAmb();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      SignatureType signatureType0 = new SignatureType();
      tProtNFe0.setSignature(signatureType0);
      assertNull(tProtNFe0.getVersao());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      tProtNFe0.versao = "br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt";
      String string0 = tProtNFe0.getVersao();
      assertEquals("br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe$InfProt", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      tProtNFe0.setVersao("");
      String string0 = tProtNFe0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      SignatureType signatureType0 = new SignatureType();
      tProtNFe0.signature = signatureType0;
      SignatureType signatureType1 = tProtNFe0.getSignature();
      assertSame(signatureType1, signatureType0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe0.setInfProt(tProtNFe_InfProt0);
      TProtNFe.InfProt tProtNFe_InfProt1 = tProtNFe0.getInfProt();
      assertNull(tProtNFe_InfProt1.getVerAplic());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      String string0 = tProtNFe0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      SignatureType signatureType0 = tProtNFe0.getSignature();
      assertNull(signatureType0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TProtNFe tProtNFe0 = new TProtNFe();
      TProtNFe.InfProt tProtNFe_InfProt0 = tProtNFe0.getInfProt();
      assertNull(tProtNFe_InfProt0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      byte[] byteArray0 = tProtNFe_InfProt0.getDigVal();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      byte[] byteArray0 = new byte[2];
      tProtNFe_InfProt0.setDigVal(byteArray0);
      assertNull(tProtNFe_InfProt0.getCStat());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setVerAplic("");
      assertNull(tProtNFe_InfProt0.getNProt());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TProtNFe.InfProt tProtNFe_InfProt0 = new TProtNFe.InfProt();
      tProtNFe_InfProt0.setTpAmb("");
      String string0 = tProtNFe_InfProt0.getTpAmb();
      assertEquals("", string0);
  }
}
