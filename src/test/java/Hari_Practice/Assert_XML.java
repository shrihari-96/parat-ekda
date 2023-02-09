package Hari_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_XML
{
  @Test
  public void HardAssert1()
  {
	  //Hard Assert
	  String a= "hari";
	  String b= "hari";
	  String c= "Hari";
	  String d= null;
	  boolean e= true;
	  boolean f= false;
	  
	  Assert.assertEquals(a, b, "failed due to not equals");
	  System.out.println("=======================================");
	  Assert.assertNotEquals(a, c, "failed due to equals");
	  System.out.println("=======================================");
	  
	  Assert.assertTrue(e, "failed due to not True");
	  Assert.assertTrue(a.contains(b), "failed due to not True");
	  System.out.println("=======================================");
	  Assert.assertFalse(f, "failed due to not False");
	  Assert.assertFalse(a.contains(c), "failed due to not False");
	  System.out.println("=======================================");
	  
	  Assert.assertNull(d, "failed due to not null");
	  Assert.assertNotNull(a, "failed due to null");
	  System.out.println("=======================================");
	  
//	  Assert.fail();
  }
  
  @Test (groups = "reg")
  public void SoftAssert2()
  {
	  //Soft Assert
	  String a= "hari";
	  String b= "hari";
	  String c= "Hari";
	  String d= null;
	  boolean e= true;
	  boolean f= false;
	  
	  SoftAssert SA = new SoftAssert();
	  
	  SA.assertEquals(a, b, "failed due to not equals");
	  System.out.println("=======================================");
	  SA.assertNotEquals(a, c, "failed due to equals");
	  System.out.println("=======================================");
	  
	  SA.assertTrue(f, "xyz");
	  SA.assertTrue(a.contains(b), "contains xyz");
	  System.out.println("=======================================");
	  SA.assertFalse(f, "failed due to not False");
	  SA.assertFalse(a.contains(c), "failed due to not False");
	  System.out.println("=======================================");
	  
	  SA.assertNull(d, "failed due to not null");
	  SA.assertNotNull(a, "failed due to null");
	  System.out.println("=======================================");
	  
//	  Assert.fail();
	  
	  SA.assertAll();
  }
}
