/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 08:03:16 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.epec;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema.epec.KeyInfoType;
import br.com.swconsultoria.nfe.schema.epec.ObjectFactory;
import br.com.swconsultoria.nfe.schema.epec.ReferenceType;
import br.com.swconsultoria.nfe.schema.epec.SignatureType;
import br.com.swconsultoria.nfe.schema.epec.SignatureValueType;
import br.com.swconsultoria.nfe.schema.epec.SignedInfoType;
import br.com.swconsultoria.nfe.schema.epec.TEnvEvento;
import br.com.swconsultoria.nfe.schema.epec.TEvento;
import br.com.swconsultoria.nfe.schema.epec.TProcEvento;
import br.com.swconsultoria.nfe.schema.epec.TRetEnvEvento;
import br.com.swconsultoria.nfe.schema.epec.TRetEvento;
import br.com.swconsultoria.nfe.schema.epec.TUf;
import br.com.swconsultoria.nfe.schema.epec.TransformType;
import br.com.swconsultoria.nfe.schema.epec.TransformsType;
import br.com.swconsultoria.nfe.schema.epec.X509DataType;
import javax.xml.bind.JAXBElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectFactory_ESTest extends ObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TProcEvento tProcEvento0 = objectFactory0.createTProcEvento();
      assertNull(tProcEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TUf tUf0 = TUf.RR;
      JAXBElement<TUf> jAXBElement0 = objectFactory0.createUF(tUf0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<SignatureType> jAXBElement0 = objectFactory0.createSignature((SignatureType) null);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento tEvento0 = new TEvento();
      JAXBElement<TEvento> jAXBElement0 = objectFactory0.createEvento(tEvento0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType.DigestMethod referenceType_DigestMethod0 = objectFactory0.createReferenceTypeDigestMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#sha1", referenceType_DigestMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      KeyInfoType keyInfoType0 = objectFactory0.createKeyInfoType();
      assertNull(keyInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformType transformType0 = objectFactory0.createTransformType();
      assertNull(transformType0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createVICMS("|QlVc U /");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createCOrgaoAutor("yfO!8&Qz)bruB3~H");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEnvEvento tEnvEvento0 = objectFactory0.createTEnvEvento();
      assertNull(tEnvEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureValueType signatureValueType0 = objectFactory0.createSignatureValueType();
      assertNull(signatureValueType0.getId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createVNF("T&8%8Y");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createVerAplic("dhEmi");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureType signatureType0 = objectFactory0.createSignatureType();
      assertNull(signatureType0.getId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createDhEmi("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetEvento.InfEvento tRetEvento_InfEvento0 = objectFactory0.createTRetEventoInfEvento();
      assertNull(tRetEvento_InfEvento0.getTpAmb());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento.DetEvento.Dest tEvento_InfEvento_DetEvento_Dest0 = objectFactory0.createTEventoInfEventoDetEventoDest();
      assertNull(tEvento_InfEvento_DetEvento_Dest0.getIE());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType referenceType0 = objectFactory0.createReferenceType();
      assertNull(referenceType0.getURI());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createDescEvento("RJ");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetEvento tRetEvento0 = objectFactory0.createTRetEvento();
      assertNull(tRetEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformsType transformsType0 = objectFactory0.createTransformsType();
      assertNotNull(transformsType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      X509DataType x509DataType0 = objectFactory0.createX509DataType();
      assertNotNull(x509DataType0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = objectFactory0.createSignedInfoTypeSignatureMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#rsa-sha1", signedInfoType_SignatureMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createVST("RO");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createTpNF("=QDq.!lk.Z[LAA");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType signedInfoType0 = objectFactory0.createSignedInfoType();
      assertNull(signedInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetEnvEvento tRetEnvEvento0 = objectFactory0.createTRetEnvEvento();
      assertNull(tRetEnvEvento0.getIdLote());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento tEvento_InfEvento0 = objectFactory0.createTEventoInfEvento();
      assertNull(tEvento_InfEvento0.getChNFe());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento.InfEvento.DetEvento tEvento_InfEvento_DetEvento0 = objectFactory0.createTEventoInfEventoDetEvento();
      assertNull(tEvento_InfEvento_DetEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = objectFactory0.createSignedInfoTypeCanonicalizationMethod();
      assertEquals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", signedInfoType_CanonicalizationMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TEvento tEvento0 = objectFactory0.createTEvento();
      assertNull(tEvento0.getVersao());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createIE("");
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JAXBElement<String> jAXBElement0 = objectFactory0.createTpAutor("br.com.swconsultoria.nfe.schema.epec.ObjectFactory");
      assertNotNull(jAXBElement0);
  }
}
