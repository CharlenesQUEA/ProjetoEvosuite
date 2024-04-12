/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 09:02:17 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.retInutNFe;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.KeyInfoType;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.ObjectFactory;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.ReferenceType;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.SignatureType;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.SignatureValueType;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.SignedInfoType;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.TInutNFe;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.TProcInutNFe;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.TRetInutNFe;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.TransformType;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.TransformsType;
import br.com.swconsultoria.nfe.schema_4.retInutNFe.X509DataType;
import javax.xml.bind.JAXBElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectFactory_ESTest extends ObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType signedInfoType0 = objectFactory0.createSignedInfoType();
      assertNull(signedInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.CanonicalizationMethod signedInfoType_CanonicalizationMethod0 = objectFactory0.createSignedInfoTypeCanonicalizationMethod();
      assertEquals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", signedInfoType_CanonicalizationMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TInutNFe tInutNFe0 = objectFactory0.createTInutNFe();
      assertNull(tInutNFe0.getVersao());
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
      TInutNFe.InfInut tInutNFe_InfInut0 = objectFactory0.createTInutNFeInfInut();
      assertNull(tInutNFe_InfInut0.getTpAmb());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType.DigestMethod referenceType_DigestMethod0 = objectFactory0.createReferenceTypeDigestMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#sha1", referenceType_DigestMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignedInfoType.SignatureMethod signedInfoType_SignatureMethod0 = objectFactory0.createSignedInfoTypeSignatureMethod();
      assertEquals("http://www.w3.org/2000/09/xmldsig#rsa-sha1", signedInfoType_SignatureMethod0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetInutNFe.InfInut tRetInutNFe_InfInut0 = objectFactory0.createTRetInutNFeInfInut();
      assertNull(tRetInutNFe_InfInut0.getCStat());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureValueType signatureValueType0 = objectFactory0.createSignatureValueType();
      assertNull(signatureValueType0.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetInutNFe tRetInutNFe0 = objectFactory0.createTRetInutNFe();
      assertNull(tRetInutNFe0.getVersao());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformsType transformsType0 = objectFactory0.createTransformsType();
      assertNotNull(transformsType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TransformType transformType0 = objectFactory0.createTransformType();
      assertNull(transformType0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      KeyInfoType keyInfoType0 = objectFactory0.createKeyInfoType();
      assertNull(keyInfoType0.getId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ReferenceType referenceType0 = objectFactory0.createReferenceType();
      assertNull(referenceType0.getURI());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TRetInutNFe tRetInutNFe0 = new TRetInutNFe();
      JAXBElement<TRetInutNFe> jAXBElement0 = objectFactory0.createRetInutNFe(tRetInutNFe0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      TProcInutNFe tProcInutNFe0 = objectFactory0.createTProcInutNFe();
      assertNull(tProcInutNFe0.getVersao());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      SignatureType signatureType0 = objectFactory0.createSignatureType();
      JAXBElement<SignatureType> jAXBElement0 = objectFactory0.createSignature(signatureType0);
      assertNotNull(jAXBElement0);
  }
}
