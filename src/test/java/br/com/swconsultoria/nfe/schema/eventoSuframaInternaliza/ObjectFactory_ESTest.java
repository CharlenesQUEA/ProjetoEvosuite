/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 09:05:38 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.Ctg;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.KeyInfoType;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.ModalOutro;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.ModalRodov;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.ObjectFactory;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.ReferenceType;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.SignatureType;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.SignatureValueType;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.SignedInfoType;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.TEnvEvento;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.TEvento;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.TProcEvento;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.TRetEnvEvento;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.TUf;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.TransformType;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.TransformsType;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.TretEvento;
import br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.X509DataType;
import javax.xml.bind.JAXBElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectFactory_ESTest extends ObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      Ctg ctg0 = objectFactory0.createCtg();
      assertNull(ctg0.getUFDest());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createCPFDest("Ho)K#i=kZ!x B[2\"");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = objectFactory0.createSignedInfoTypeSignatureMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#rsa-sha1", signedInfoType_SignatureMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ModalRodov modalRodov0 = objectFactory0.createModalRodov();
      assertNull(modalRodov0.getUFCarreta2());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createIndOffline("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createCOrgaoAutor("?W/3:AN#I9N");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createCNPJDest("cV#C*");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createTpModal("cV#C*");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<SignatureType> jAXBElement0 = objectFactory0.createSignature((SignatureType) null);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createVTotalNFe("CPFDest");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createPlacaVeic("%6{|.pAwa");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createCPFOper("UFCarreta2");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createXPostoUF("YwO$BUqI$WPLVIDI");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType.DigestMethod referenceType_DigestMethod0 = objectFactory0.createReferenceTypeDigestMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#sha1", referenceType_DigestMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createTpEmis("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureValueType signatureValueType0 = objectFactory0.createSignatureValueType();
      assertNull(signatureValueType0.getId());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createDiaEmi("'<r0<5t~M=$");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetEnvEvento tRetEnvEvento0 = objectFactory0.createTRetEnvEvento();
      assertNull(tRetEnvEvento0.getCStat());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createNFormSeg("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createPlacaCarreta("GG=]u|M|'K5/]");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      KeyInfoType keyInfoType0 = objectFactory0.createKeyInfoType();
      assertNull(keyInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformsType transformsType0 = objectFactory0.createTransformsType();
      assertNotNull(transformsType0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TUf tUf0 = TUf.AC;
      JAXBElement<TUf> jAXBElement0 = objectFactory0.createUFCarreta2(tUf0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createXNomeOper(",r&u1FUm#iyTRg|gv");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = objectFactory0.createTEventoInfEventoDetEvento();
      assertNull(tEvento_InfEvento_DetEvento0.getDescEvento());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TUf tUf0 = TUf.TO;
      JAXBElement<TUf> jAXBElement0 = objectFactory0.createUFVeic(tUf0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createCPostoUF("xNomeOper");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType signedInfoType0 = objectFactory0.createSignedInfoType();
      assertNull(signedInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createIndICMS("br.com.swconsultoria.nfe.schema.eventoSuframaInternaliza.ReferenceType$DigestMethod");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ModalOutro modalOutro0 = objectFactory0.createModalOutro();
      assertNull(modalOutro0.getXIdent());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createLongGPS("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      X509DataType x509DataType0 = objectFactory0.createX509DataType();
      assertNotNull(x509DataType0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureType signatureType0 = objectFactory0.createSignatureType();
      assertNull(signatureType0.getId());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType referenceType0 = objectFactory0.createReferenceType();
      assertNull(referenceType0.getURI());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEnvEvento tEnvEvento0 = objectFactory0.createTEnvEvento();
      assertNull(tEnvEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createChCTe("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createChMDFe("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createSentidoVia("pv&m@{.U^}u2;V");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createPlacaCarreta2("=Ut3'}>yL\nt-0P5z");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createIndRet("1e1FF,");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TUf tUf0 = TUf.RO;
      JAXBElement<TUf> jAXBElement0 = objectFactory0.createUFCarreta(tUf0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TretEvento.InfEvento tretEvento_InfEvento0 = objectFactory0.createTretEventoInfEvento();
      assertNull(tretEvento_InfEvento0.getEmailDest());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = objectFactory0.createSignedInfoTypeCanonicalizationMethod();
      assertEquals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", signedInfoType_CanonicalizationMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento tEvento_InfEvento0 = objectFactory0.createTEventoInfEvento();
      assertNull(tEvento_InfEvento0.getDhEvento());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TProcEvento tProcEvento0 = objectFactory0.createTProcEvento();
      assertNull(tProcEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createIndICMSST((String) null);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createDhPas("diaEmi");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createDescEvento("I3}^.`");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TUf tUf0 = TUf.AM;
      JAXBElement<TUf> jAXBElement0 = objectFactory0.createUFDest(tUf0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createXObs("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createLatGPS("dhPas");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createXIdent("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento tEvento0 = objectFactory0.createTEvento();
      assertNull(tEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento tEvento0 = new TEvento();
      JAXBElement<TEvento> jAXBElement0 = objectFactory0.createEvento(tEvento0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformType transformType0 = objectFactory0.createTransformType();
      assertNull(transformType0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TretEvento tretEvento0 = objectFactory0.createTretEvento();
      assertNull(tretEvento0.getVersao());
  }
}
