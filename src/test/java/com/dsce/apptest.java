package com.dsce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class apptest {

 
@Test 
public void testlogin1() 
{ 
app myapp=new app(); 
Assert.assertEquals(0,myapp.userlogin("abc","abc1234")); 
} 
@Test 
public void testlogin2() 
{ 
app myapp=new app(); 
Assert.assertEquals(1,myapp.userlogin("abc","abc@1234")); 
} 
} 
