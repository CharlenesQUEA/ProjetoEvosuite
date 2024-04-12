/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Apr 09 02:40:40 GMT 2024
 */

package br.com.swconsultoria.nfe.schema_4.enviNFe;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TNFe_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TNFe_ESTest_scaffolding.class.getClassLoader() ,
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide$NFref$RefNF",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp$Transporta",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp$Vol",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$DI",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ObsItem$ObsCont",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$DetExport",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Comb",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$II",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS15",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS$COFINSNT",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cana$ForDia",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS$PISAliq",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS02",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Pag$DetPag",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFeSupl",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$InfProdNFF",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TEndereco",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Emit",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TLocal",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$AutXML",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ISSQN",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfAdic",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMSUFDest",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS$COFINSOutr",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$InfProdEmb",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$VeicProd",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ObsItem",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS$COFINSQtde",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cobr",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS$PISQtde",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS$PISOutr",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TUf",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS61",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ImpostoDevol$IPI",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp$RetTransp",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TInfRespTec",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TEnderEmi",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfSolicNFF",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Comb$Encerrante",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Med",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.KeyInfoType",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS53",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS$COFINSAliq",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cana",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Rastro",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfIntermed",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Total",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfAdic$ObsCont",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Arma",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Total$RetTrib",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Compra",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfAdic$ProcRef",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PISST",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Total$ICMSTot",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp$Vol$Lacres",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Exporta",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide$NFref",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$DI$Adi",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.SignatureType",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Comb$OrigComb",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.SignedInfoType",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Pag$DetPag$Card",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Dest",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfAdic$ObsFisco",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Comb$CIDE",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Total$ISSQNtot",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$DetExport$ExportInd",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TUfEmi",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide$NFref$RefECF",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TVeiculo",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINSST",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cobr$Fat",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ObsItem$ObsFisco",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.SignatureValueType",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cana$Deduc",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS$PISNT",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ImpostoDevol",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Pag",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cobr$Dup",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Avulsa",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide$NFref$RefNFP"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TNFe_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PISST",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$DI",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMSUFDest",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS53",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cana$Deduc",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfSolicNFF",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cobr$Fat",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Avulsa",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$II",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Dest",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINSST",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Pag$DetPag",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Total",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide$NFref",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Comb$Encerrante",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$VeicProd",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cana",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFeSupl",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS15",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Pag$DetPag$Card",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ObsItem",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$DetExport",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$InfProdNFF",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cana$ForDia",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Total$ICMSTot",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Rastro",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS$COFINSQtde",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Comb",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp$Vol",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ObsItem$ObsFisco",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS$COFINSNT",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Emit",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS$PISQtde",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Arma",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cobr$Dup",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Comb$CIDE",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS$COFINSAliq",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp$Vol$Lacres",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Med",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS$COFINSOutr",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ObsItem$ObsCont",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Total$RetTrib",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide$NFref$RefNF",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfAdic$ProcRef",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Compra",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ISSQN",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$DetExport$ExportInd",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfAdic$ObsCont",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Pag",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfAdic$ObsFisco",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS$PISNT",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$InfIntermed",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$ImpostoDevol",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMS02",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Cobr",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$DI$Adi",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Total$ISSQNtot",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS$PISOutr",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Ide$NFref$RefECF",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$AutXML",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Prod$Comb$OrigComb",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS$PISAliq",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Exporta",
      "br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Transp$RetTransp"
    );
  }
}
