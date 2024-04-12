/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Apr 09 07:21:18 GMT 2024
 */

package br.com.swconsultoria.nfe.schema.envEventoCancNFe;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ObjectFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "br.com.swconsultoria.nfe.schema.envEventoCancNFe.ObjectFactory"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ObjectFactory_ESTest_scaffolding.class.getClassLoader() ,
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TRetEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignedInfoType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEvento$InfEvento$DetEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TProcEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.ObjectFactory",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.ReferenceType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TransformType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TRetEvento$InfEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TransformsType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignatureType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEnvEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignedInfoType$SignatureMethod",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignatureValueType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignedInfoType$CanonicalizationMethod",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.KeyInfoType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.X509DataType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TRetEnvEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEvento$InfEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.ReferenceType$DigestMethod"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ObjectFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.ObjectFactory",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TRetEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEvento$InfEvento$DetEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TProcEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.ReferenceType$DigestMethod",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.X509DataType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignedInfoType$CanonicalizationMethod",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignedInfoType$SignatureMethod",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TRetEnvEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TransformsType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignatureType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignedInfoType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.KeyInfoType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TransformType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.ReferenceType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEnvEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.SignatureValueType",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TRetEvento$InfEvento",
      "br.com.swconsultoria.nfe.schema.envEventoCancNFe.TEvento$InfEvento"
    );
  }
}
