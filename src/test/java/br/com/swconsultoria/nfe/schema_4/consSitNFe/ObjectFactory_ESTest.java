/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 05:41:09 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.consSitNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.KeyInfoType;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.ObjectFactory;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.ReferenceType;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.SignatureType;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.SignatureValueType;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.SignedInfoType;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TConsSitNFe;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TEvento;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TProcEvento;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TProtNFe;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TRetCancNFe;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TRetConsSitNFe;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TRetEvento;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TransformType;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.TransformsType;
import br.com.swconsultoria.nfe.schema_4.consSitNFe.X509DataType;
import javax.xml.bind.JAXBElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectFactory_ESTest extends ObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      KeyInfoType keyInfoType0 = objectFactory0.createKeyInfoType();
      assertNull(keyInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento tEvento_InfEvento0 = objectFactory0.createTEventoInfEvento();
      assertNull(tEvento_InfEvento0.getId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformType transformType0 = objectFactory0.createTransformType();
      assertNull(transformType0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      X509DataType x509DataType0 = objectFactory0.createX509DataType();
      assertNotNull(x509DataType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformsType transformsType0 = objectFactory0.createTransformsType();
      assertNotNull(transformsType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType referenceType0 = objectFactory0.createReferenceType();
      assertNull(referenceType0.getURI());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType.DigestMethod referenceType_DigestMethod0 = objectFactory0.createReferenceTypeDigestMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#sha1", referenceType_DigestMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetCancNFe.InfCanc tRetCancNFe_InfCanc0 = objectFactory0.createTRetCancNFeInfCanc();
      assertNull(tRetCancNFe_InfCanc0.getXMotivo());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = objectFactory0.createSignedInfoTypeCanonicalizationMethod();
      assertEquals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", signedInfoType_CanonicalizationMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureType signatureType0 = objectFactory0.createSignatureType();
      JAXBElement<SignatureType> jAXBElement0 = objectFactory0.createSignature(signatureType0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetConsSitNFe tRetConsSitNFe0 = objectFactory0.createTRetConsSitNFe();
      assertNull(tRetConsSitNFe0.getVersao());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TProtNFe tProtNFe0 = objectFactory0.createTProtNFe();
      assertNull(tProtNFe0.getVersao());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TProcEvento tProcEvento0 = objectFactory0.createTProcEvento();
      assertNull(tProcEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TConsSitNFe tConsSitNFe0 = objectFactory0.createTConsSitNFe();
      JAXBElement<TConsSitNFe> jAXBElement0 = objectFactory0.createConsSitNFe(tConsSitNFe0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetEvento tRetEvento0 = objectFactory0.createTRetEvento();
      assertNull(tRetEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetEvento.InfEvento tRetEvento_InfEvento0 = objectFactory0.createTRetEventoInfEvento();
      assertNull(tRetEvento_InfEvento0.getXMotivo());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TProtNFe.InfProt tProtNFe_InfProt0 = objectFactory0.createTProtNFeInfProt();
      assertNull(tProtNFe_InfProt0.getChNFe());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = objectFactory0.createSignedInfoTypeSignatureMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#rsa-sha1", signedInfoType_SignatureMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureValueType signatureValueType0 = objectFactory0.createSignatureValueType();
      assertNull(signatureValueType0.getId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType signedInfoType0 = objectFactory0.createSignedInfoType();
      assertNull(signedInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = objectFactory0.createTEventoInfEventoDetEvento();
      assertNotNull(tEvento_InfEvento_DetEvento0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento tEvento0 = objectFactory0.createTEvento();
      assertNull(tEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetCancNFe tRetCancNFe0 = objectFactory0.createTRetCancNFe();
      assertNull(tRetCancNFe0.getVersao());
  }
}
