/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 09:54:08 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envcce;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.envcce.KeyInfoType;
import br.com.swconsultoria.nfe.schema.envcce.ObjectFactory;
import br.com.swconsultoria.nfe.schema.envcce.ReferenceType;
import br.com.swconsultoria.nfe.schema.envcce.SignatureType;
import br.com.swconsultoria.nfe.schema.envcce.SignatureValueType;
import br.com.swconsultoria.nfe.schema.envcce.SignedInfoType;
import br.com.swconsultoria.nfe.schema.envcce.TEnvEvento;
import br.com.swconsultoria.nfe.schema.envcce.TEvento;
import br.com.swconsultoria.nfe.schema.envcce.TProcEvento;
import br.com.swconsultoria.nfe.schema.envcce.TRetEnvEvento;
import br.com.swconsultoria.nfe.schema.envcce.TransformType;
import br.com.swconsultoria.nfe.schema.envcce.TransformsType;
import br.com.swconsultoria.nfe.schema.envcce.TretEvento;
import br.com.swconsultoria.nfe.schema.envcce.X509DataType;
import javax.xml.bind.JAXBElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectFactory_ESTest extends ObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformType transformType0 = objectFactory0.createTransformType();
      assertNull(transformType0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento tEvento_InfEvento0 = objectFactory0.createTEventoInfEvento();
      assertNull(tEvento_InfEvento0.getVerEvento());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = objectFactory0.createTEventoInfEventoDetEvento();
      assertNull(tEvento_InfEvento_DetEvento0.getXCondUso());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureValueType signatureValueType0 = objectFactory0.createSignatureValueType();
      assertNull(signatureValueType0.getId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TretEvento tretEvento0 = objectFactory0.createTretEvento();
      assertNull(tretEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TretEvento.InfEvento tretEvento_InfEvento0 = objectFactory0.createTretEventoInfEvento();
      assertNull(tretEvento_InfEvento0.getCNPJDest());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEnvEvento tEnvEvento0 = objectFactory0.createTEnvEvento();
      JAXBElement<TEnvEvento> jAXBElement0 = objectFactory0.createEnvEvento(tEnvEvento0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = objectFactory0.createSignedInfoTypeSignatureMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#rsa-sha1", signedInfoType_SignatureMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetEnvEvento tRetEnvEvento0 = objectFactory0.createTRetEnvEvento();
      assertNull(tRetEnvEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = objectFactory0.createSignedInfoTypeCanonicalizationMethod();
      assertEquals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", signedInfoType_CanonicalizationMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType referenceType0 = objectFactory0.createReferenceType();
      assertNull(referenceType0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      KeyInfoType keyInfoType0 = objectFactory0.createKeyInfoType();
      assertNull(keyInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      X509DataType x509DataType0 = objectFactory0.createX509DataType();
      assertNotNull(x509DataType0);
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
      SignatureType signatureType0 = objectFactory0.createSignatureType();
      JAXBElement<SignatureType> jAXBElement0 = objectFactory0.createSignature(signatureType0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformsType transformsType0 = objectFactory0.createTransformsType();
      assertNotNull(transformsType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType signedInfoType0 = objectFactory0.createSignedInfoType();
      assertNull(signedInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento tEvento0 = objectFactory0.createTEvento();
      assertNull(tEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TProcEvento tProcEvento0 = objectFactory0.createTProcEvento();
      assertNull(tProcEvento0.getVersao());
  }
}
