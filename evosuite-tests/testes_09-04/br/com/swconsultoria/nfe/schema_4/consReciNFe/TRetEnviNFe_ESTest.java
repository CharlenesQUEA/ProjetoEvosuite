/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 09:36:59 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.consReciNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.consReciNFe.TProtNFe;
import br.com.swconsultoria.nfe.schema_4.consReciNFe.TRetEnviNFe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TRetEnviNFe_ESTest extends TRetEnviNFe_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TRetEnviNFe.InfRec tRetEnviNFe_InfRec0 = new TRetEnviNFe.InfRec();
      tRetEnviNFe_InfRec0.setTMed("p.Dmrh1\"");
      assertEquals("p.Dmrh1\"", tRetEnviNFe_InfRec0.getTMed());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TRetEnviNFe.InfRec tRetEnviNFe_InfRec0 = new TRetEnviNFe.InfRec();
      tRetEnviNFe_InfRec0.setNRec("UFfrHby");
      String string0 = tRetEnviNFe_InfRec0.getTMed();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TRetEnviNFe.InfRec tRetEnviNFe_InfRec0 = new TRetEnviNFe.InfRec();
      tRetEnviNFe_InfRec0.tMed = null;
      tRetEnviNFe_InfRec0.tMed = "#3$gWWxh'I?";
      String string0 = tRetEnviNFe_InfRec0.getNRec();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setVersao("br.com.swconsultoria.nfe.schema_4.consReciNFe.SignedInfoType");
      assertNull(tRetEnviNFe0.getXMotivo());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setDhRecbto("");
      tRetEnviNFe0.setVersao((String) null);
      assertNull(tRetEnviNFe0.getTpAmb());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setVerAplic("br.com.swconsultoria.nfe.schema_4.consReciNFe.TRetEnviNFe");
      tRetEnviNFe0.setVersao((String) null);
      assertNull(tRetEnviNFe0.getTpAmb());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setCUF("");
      tRetEnviNFe0.setVersao((String) null);
      assertNull(tRetEnviNFe0.getVersao());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      TProtNFe tProtNFe0 = new TProtNFe();
      tRetEnviNFe0.setProtNFe(tProtNFe0);
      assertNull(tRetEnviNFe0.getTpAmb());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setXMotivo("br.com.swconsultoria.nfe.schema_4.consReciNFe.TRetEnviNFe$InfRec");
      String string0 = tRetEnviNFe0.getXMotivo();
      assertEquals("br.com.swconsultoria.nfe.schema_4.consReciNFe.TRetEnviNFe$InfRec", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setXMotivo("");
      String string0 = tRetEnviNFe0.getXMotivo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.versao = "br.com.swconsultoria.nfe.schema_4.consReciNFe.ReferenceType$DigestMethod";
      String string0 = tRetEnviNFe0.getVersao();
      assertEquals("br.com.swconsultoria.nfe.schema_4.consReciNFe.ReferenceType$DigestMethod", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.versao = "";
      String string0 = tRetEnviNFe0.getVersao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setVerAplic("br.com.swconsultoria.nfe.schema_4.consReciNFe.TRetEnviNFe");
      String string0 = tRetEnviNFe0.getVerAplic();
      assertEquals("br.com.swconsultoria.nfe.schema_4.consReciNFe.TRetEnviNFe", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setVerAplic("");
      String string0 = tRetEnviNFe0.getVerAplic();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.tpAmb = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
      String string0 = tRetEnviNFe0.getTpAmb();
      assertEquals("http://www.w3.org/2000/09/xmldsig#rsa-sha1", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setTpAmb("");
      String string0 = tRetEnviNFe0.getTpAmb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      TProtNFe tProtNFe0 = new TProtNFe();
      tRetEnviNFe0.protNFe = tProtNFe0;
      TProtNFe tProtNFe1 = tRetEnviNFe0.getProtNFe();
      assertNull(tProtNFe1.getVersao());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      TRetEnviNFe.InfRec tRetEnviNFe_InfRec0 = new TRetEnviNFe.InfRec();
      tRetEnviNFe0.setInfRec(tRetEnviNFe_InfRec0);
      TRetEnviNFe.InfRec tRetEnviNFe_InfRec1 = tRetEnviNFe0.getInfRec();
      assertNull(tRetEnviNFe_InfRec1.getTMed());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.dhRecbto = "BX[8(1e-1K1_P}Q@";
      String string0 = tRetEnviNFe0.getDhRecbto();
      assertEquals("BX[8(1e-1K1_P}Q@", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setCUF("U#B&LDz<.Z\f3y+");
      String string0 = tRetEnviNFe0.getCUF();
      assertEquals("U#B&LDz<.Z\f3y+", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setCUF("");
      String string0 = tRetEnviNFe0.getCUF();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.cStat = "br.com.swconsultoria.nfe.schema_4.consReciNFe.SignedInfoType";
      String string0 = tRetEnviNFe0.getCStat();
      assertEquals("br.com.swconsultoria.nfe.schema_4.consReciNFe.SignedInfoType", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setCStat("");
      String string0 = tRetEnviNFe0.getCStat();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      TRetEnviNFe.InfRec tRetEnviNFe_InfRec0 = tRetEnviNFe0.getInfRec();
      assertNull(tRetEnviNFe_InfRec0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      tRetEnviNFe0.setDhRecbto("");
      String string0 = tRetEnviNFe0.getDhRecbto();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      String string0 = tRetEnviNFe0.getCUF();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      String string0 = tRetEnviNFe0.getXMotivo();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      String string0 = tRetEnviNFe0.getVerAplic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      TProtNFe tProtNFe0 = tRetEnviNFe0.getProtNFe();
      assertNull(tProtNFe0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      String string0 = tRetEnviNFe0.getDhRecbto();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      String string0 = tRetEnviNFe0.getVersao();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      String string0 = tRetEnviNFe0.getCStat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TRetEnviNFe tRetEnviNFe0 = new TRetEnviNFe();
      String string0 = tRetEnviNFe0.getTpAmb();
      assertNull(string0);
  }
}
