/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Apr 09 10:44:06 GMT 2024
 */

package br.com.swconsultoria.nfe;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ManifestacaoDestinatario_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "br.com.swconsultoria.nfe.ManifestacaoDestinatario"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\charl\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\charl\\Downloads\\Deletar depois\\Plugins evosuite\\Java_NFe-master"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\charl"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "charl"); 
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ManifestacaoDestinatario_ESTest_scaffolding.class.getClassLoader() ,
      "br.com.swconsultoria.nfe.schema.envConfRecebto.KeyInfoType",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.SignedInfoType$CanonicalizationMethod",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.ReferenceType",
      "br.com.swconsultoria.nfe.dom.enuns.DocumentoEnum",
      "br.com.swconsultoria.nfe.dom.enuns.AssinaturaEnum",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TEnvEvento",
      "br.com.swconsultoria.nfe.dom.enuns.AmbienteEnum",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TEnviNFe",
      "br.com.swconsultoria.nfe.dom.Proxy",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.SignedInfoType$SignatureMethod",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.ReferenceType$DigestMethod",
      "br.com.swconsultoria.nfe.dom.enuns.ServicosEnum",
      "br.com.swconsultoria.nfe.util.ObjetoUtil",
      "br.com.swconsultoria.certificado.exception.CertificadoException",
      "br.com.swconsultoria.certificado.TipoCertificadoEnum",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TEvento$InfEvento",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.ObjectFactory",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TProcEvento",
      "br.com.swconsultoria.nfe.dom.ConfiguracoesNfe",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.SignatureValueType",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TretEvento$InfEvento",
      "br.com.swconsultoria.nfe.ManifestacaoDestinatario",
      "br.com.swconsultoria.nfe.Assinar",
      "br.com.swconsultoria.nfe.util.XsdUtil",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.SignatureType",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TransformType",
      "br.com.swconsultoria.nfe.Eventos",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TRetEnvEvento",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TransformsType",
      "br.com.swconsultoria.nfe.exception.NfeException",
      "br.com.swconsultoria.nfe.dom.enuns.EstadosEnum",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.package-info",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TEvento$InfEvento$DetEvento",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TEvento",
      "br.com.swconsultoria.nfe.util.WebServiceUtil",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.SignedInfoType",
      "br.com.swconsultoria.certificado.Certificado",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.X509DataType",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TretEvento",
      "br.com.swconsultoria.nfe.util.XmlNfeUtil"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ManifestacaoDestinatario_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "br.com.swconsultoria.nfe.ManifestacaoDestinatario",
      "br.com.swconsultoria.nfe.util.XsdUtil",
      "br.com.swconsultoria.nfe.util.XmlNfeUtil",
      "br.com.swconsultoria.nfe.dom.enuns.ServicosEnum",
      "br.com.swconsultoria.nfe.dom.enuns.DocumentoEnum",
      "br.com.swconsultoria.nfe.dom.enuns.AssinaturaEnum",
      "br.com.swconsultoria.certificado.TipoCertificadoEnum",
      "br.com.swconsultoria.nfe.Assinar",
      "br.com.swconsultoria.nfe.dom.enuns.AmbienteEnum",
      "br.com.swconsultoria.nfe.util.WebServiceUtil",
      "br.com.swconsultoria.nfe.dom.enuns.EstadosEnum",
      "br.com.swconsultoria.certificado.Certificado",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TEnvEvento",
      "br.com.swconsultoria.nfe.dom.ConfiguracoesNfe",
      "br.com.swconsultoria.nfe.util.ObjetoUtil",
      "br.com.swconsultoria.nfe.dom.Proxy",
      "br.com.swconsultoria.certificado.exception.CertificadoException",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.ObjectFactory",
      "br.com.swconsultoria.nfe.schema.envConfRecebto.TRetEnvEvento"
    );
  }
}
