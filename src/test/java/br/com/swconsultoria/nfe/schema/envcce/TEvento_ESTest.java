/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 06:14:23 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envcce;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envcce.SignatureType;
import br.com.swconsultoria.nfe.schema.envcce.TEvento;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TEvento_ESTest extends TEvento_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.versao = "gb:>1";
      tEvento_InfEvento_DetEvento0.setVersao((String) null);
      assertNull(tEvento_InfEvento_DetEvento0.getDescEvento());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.descEvento = "ldyqd3<`jRP4#bG";
      tEvento_InfEvento_DetEvento0.setVersao((String) null);
      assertEquals("ldyqd3<`jRP4#bG", tEvento_InfEvento_DetEvento0.getDescEvento());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.detEvento = tEvento_InfEvento_DetEvento0;
      tEvento_InfEvento0.detEvento.xCondUso = "3?>5\"2";
      tEvento_InfEvento_DetEvento0.setVersao((String) null);
      assertNull(tEvento_InfEvento_DetEvento0.getXCorrecao());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.descEvento = "";
      String string0 = tEvento_InfEvento_DetEvento0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.setXCondUso("br.com.swconsultoria.nfe.schema.envcce.SignatureType");
      String string0 = tEvento_InfEvento_DetEvento0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.versao = "";
      String string0 = tEvento_InfEvento_DetEvento0.getXCondUso();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.xCorrecao = "o)[,KR;lehf7";
      String string0 = tEvento_InfEvento_DetEvento0.getXCondUso();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.descEvento = "gze_Bh";
      String string0 = tEvento_InfEvento_DetEvento0.getXCondUso();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.setXCorrecao("N");
      String string0 = tEvento_InfEvento_DetEvento0.getXCorrecao();
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.setDescEvento("br.com.swconsultoria.nfe.schema.envcce.TEvento$InfEvento$DetEvento");
      String string0 = tEvento_InfEvento_DetEvento0.getDescEvento();
      assertEquals("br.com.swconsultoria.nfe.schema.envcce.TEvento$InfEvento$DetEvento", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.id = null;
      tEvento_InfEvento0.id = "";
      String string0 = tEvento_InfEvento0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setDetEvento(tEvento_InfEvento_DetEvento0);
      assertNull(tEvento_InfEvento0.getCPF());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.verEvento = "^#tgk.{};0xfQl^";
      String string0 = tEvento_InfEvento0.getVerEvento();
      assertEquals("^#tgk.{};0xfQl^", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setNSeqEvento(",^");
      String string0 = tEvento_InfEvento0.getNSeqEvento();
      assertEquals(",^", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setTpEvento("Z7>HE]6");
      String string0 = tEvento_InfEvento0.getTpEvento();
      assertEquals("Z7>HE]6", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setDhEvento("br.com.swconsultoria.nfe.schema.envcce.X509DataType");
      String string0 = tEvento_InfEvento0.getDhEvento();
      assertEquals("br.com.swconsultoria.nfe.schema.envcce.X509DataType", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.chNFe = "";
      String string0 = tEvento_InfEvento0.getChNFe();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setCPF("D]@8w\"SZ$$");
      assertNull(tEvento_InfEvento0.getTpAmb());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.cpf = "h}VvtDR:C#%rt";
      String string0 = tEvento_InfEvento0.getCPF();
      assertEquals("h}VvtDR:C#%rt", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setCNPJ("gb:>1");
      String string0 = tEvento_InfEvento0.getCNPJ();
      assertEquals("gb:>1", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setTpAmb("R{?Y");
      TEvento tEvento0 = new TEvento();
      tEvento0.infEvento = tEvento_InfEvento0;
      String string0 = tEvento0.infEvento.getTpAmb();
      assertEquals("R{?Y", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setCOrgao("");
      String string0 = tEvento_InfEvento0.getTpAmb();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.cOrgao = "";
      String string0 = tEvento_InfEvento0.getCOrgao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TEvento tEvento0 = new TEvento();
      tEvento0.setVersao("wRdS&fyeG ");
      String string0 = tEvento0.getVersao();
      assertEquals("wRdS&fyeG ", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TEvento tEvento0 = new TEvento();
      tEvento0.versao = "";
      String string0 = tEvento0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TEvento tEvento0 = new TEvento();
      SignatureType signatureType0 = new SignatureType();
      tEvento0.signature = signatureType0;
      SignatureType signatureType1 = tEvento0.getSignature();
      assertSame(signatureType1, signatureType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = new TEvento.InfEvento.DetEvento();
      tEvento_InfEvento_DetEvento0.setXCorrecao("");
      tEvento_InfEvento_DetEvento0.setVersao((String) null);
      assertNull(tEvento_InfEvento_DetEvento0.getXCondUso());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TEvento tEvento0 = new TEvento();
      SignatureType signatureType0 = new SignatureType();
      tEvento0.setSignature(signatureType0);
      assertNull(tEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TEvento tEvento0 = new TEvento();
      String string0 = tEvento0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TEvento tEvento0 = new TEvento();
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento0.setInfEvento(tEvento_InfEvento0);
      TEvento.InfEvento tEvento_InfEvento1 = tEvento0.getInfEvento();
      assertNull(tEvento_InfEvento1.getNSeqEvento());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TEvento tEvento0 = new TEvento();
      SignatureType signatureType0 = tEvento0.getSignature();
      assertNull(signatureType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TEvento tEvento0 = new TEvento();
      TEvento.InfEvento tEvento_InfEvento0 = tEvento0.getInfEvento();
      assertNull(tEvento_InfEvento0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = tEvento_InfEvento0.getDetEvento();
      assertNull(tEvento_InfEvento_DetEvento0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setChNFe("^#tgk.{};0xfQl^");
      assertEquals("^#tgk.{};0xfQl^", tEvento_InfEvento0.getChNFe());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setVerEvento("^#tgk.{};0xfQl^");
      assertNull(tEvento_InfEvento0.getCNPJ());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TEvento.InfEvento tEvento_InfEvento0 = new TEvento.InfEvento();
      tEvento_InfEvento0.setId("bS`^cFsq{irz7~");
      assertNull(tEvento_InfEvento0.getCNPJ());
  }
}
