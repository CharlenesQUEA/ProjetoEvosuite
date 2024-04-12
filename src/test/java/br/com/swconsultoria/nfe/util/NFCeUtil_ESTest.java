/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 10:22:29 GMT 2024
 */

package br.com.swconsultoria.nfe.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.com.swconsultoria.nfe.util.NFCeUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NFCeUtil_ESTest extends NFCeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = NFCeUtil.getCodeQRCodeContingencia((String) null, "SHA-1", "!:;Z;\"XZ'hTrb)Do8&", (String) null, "SHA-1", "0", "2", "");
      assertEquals("?p=null|2|SHA-1|'h|null|5348412d31|0|A7203DAE369FB33603BB706C1BC04B126D99DD2B", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        NFCeUtil.getCodeQRCodeContingencia("br.com.swconsultoria.nfe.util.NFCeUtil", "br.com.swconsultoria.nfe.util.NFCeUtil", "br.com.swconsultoria.nfe.util.NFCeUtil", "b_d@N[{4@Rb<e4=>z", "b_d@N[{4@Rb<e4=>z", "b_d@N[{4@Rb<e4=>z", "GFf9%<,e2y", "");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"b_d@N[{4@Rb<e4=>z\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        NFCeUtil.getCodeQRCodeContingencia("", "", "", "", "", "", "?p=", "?p=");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // start 8, end 10, s.length() 0
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        NFCeUtil.getCodeQRCode("", "null?p=5+0 |2|\"Y|2|E07BCE9CF98D3C3ECF6D97625EB6FBC2D128FD01", "nkGH`", (String) null, "nkGH`?p=null|2|null|2|D09CBB07FB35CBBB8FB325D617402BFF86CFFED0");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"nkGH`\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = NFCeUtil.getCodeQRCode((String) null, (String) null, "2", "2", "nkGH`");
      assertEquals("nkGH`?p=null|2|null|2|D09CBB07FB35CBBB8FB325D617402BFF86CFFED0", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NFCeUtil nFCeUtil0 = new NFCeUtil();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = NFCeUtil.getCodeQRCode("0", "SHA-1", "0", (String) null, "0");
      assertEquals("0?p=0|2|SHA-1|0|63AB1AC4D2F9EB3A7EE8D7A8A8732917385A48E3", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        NFCeUtil.getCodeQRCodeContingencia((String) null, "%t~pLC=rrcz@M<o", "UA6PjZi[QX~", "_ZTz", (String) null, "", "Q7sX", "%t~pLC=rrcz@M<o");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.swconsultoria.nfe.util.NFCeUtil", e);
      }
  }
}
