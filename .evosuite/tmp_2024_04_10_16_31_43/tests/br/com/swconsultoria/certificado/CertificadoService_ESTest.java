/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 10 22:00:43 GMT 2024
 */

package br.com.swconsultoria.certificado;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.com.swconsultoria.certificado.Certificado;
import br.com.swconsultoria.certificado.CertificadoService;
import br.com.swconsultoria.certificado.TipoCertificadoEnum;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.nio.file.InvalidPathException;
import java.security.KeyStore;
import java.security.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CertificadoService_ESTest extends CertificadoService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        CertificadoService.certificadoPfx("1", "");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Arquivo 1 n\u00E3o existe
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        CertificadoService.listaAliasCertificadosA3((String) null, (Provider) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Senha n\u00E3o pode ser nula.
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Certificado certificado0 = new Certificado();
      try { 
        CertificadoService.inicializaCertificado(certificado0, (InputStream) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: null
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      // Undeclared exception!
      try { 
        CertificadoService.inicializaCertificado((Certificado) null, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Certificado n\u00E3o pode ser nulo.
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CertificadoService.inicializaCertificado((Certificado) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Certificado n\u00E3o pode ser nulo.
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        CertificadoService.certificadoPfxBytes(byteArray0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Senha n\u00E3o pode ser nula.
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        CertificadoService.certificadoPfx("Arquivo ", "Arquivo ");
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CertificadoService.certificadoPfx((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Caminho do Certificado n\u00E3o pode ser nulo.
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Certificado certificado0 = new Certificado();
      TipoCertificadoEnum tipoCertificadoEnum0 = TipoCertificadoEnum.REPOSITORIO_WINDOWS;
      certificado0.setTipoCertificado(tipoCertificadoEnum0);
      try { 
        CertificadoService.getKeyStore(certificado0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: no such provider: SunMSCAPI
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Certificado certificado0 = new Certificado();
      TipoCertificadoEnum tipoCertificadoEnum0 = TipoCertificadoEnum.ARQUIVO_BYTES;
      certificado0.setTipoCertificado(tipoCertificadoEnum0);
      try { 
        CertificadoService.getKeyStore(certificado0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: null
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Certificado certificado0 = new Certificado();
      TipoCertificadoEnum tipoCertificadoEnum0 = TipoCertificadoEnum.REPOSITORIO_MAC;
      certificado0.setTipoCertificado(tipoCertificadoEnum0);
      try { 
        CertificadoService.getKeyStore(certificado0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: KeychainStore not found
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Certificado certificado0 = new Certificado();
      TipoCertificadoEnum tipoCertificadoEnum0 = TipoCertificadoEnum.TOKEN_A3;
      certificado0.setTipoCertificado(tipoCertificadoEnum0);
      try { 
        CertificadoService.getKeyStore(certificado0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: null
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Certificado certificado0 = new Certificado();
      TipoCertificadoEnum tipoCertificadoEnum0 = TipoCertificadoEnum.ARQUIVO;
      certificado0.setTipoCertificado(tipoCertificadoEnum0);
      try { 
        CertificadoService.getKeyStore(certificado0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: null
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        CertificadoService.listaCertificadosWindows();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: no such provider: SunMSCAPI
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        CertificadoService.certificadoPfx("", "br.com.swconsultoria.certificado.CertificadoService");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: 
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      try { 
        CertificadoService.certificadoPfxBytes(byteArray0, "dP");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: null
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        CertificadoService.getCertificadoByCnpjCpf("`9U");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: no such provider: SunMSCAPI
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Certificado certificado0 = new Certificado();
      try { 
        CertificadoService.inicializaCertificado(certificado0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: null
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        CertificadoService.listaCertificadosMac();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro Ao pegar KeyStore: KeychainStore not found
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Certificado certificado0 = new Certificado();
      // Undeclared exception!
      try { 
        CertificadoService.getCertificate(certificado0, (KeyStore) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.certificado.CertificadoService", e);
      }
  }
}
