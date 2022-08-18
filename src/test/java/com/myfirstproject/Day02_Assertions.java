package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

public class Day02_Assertions {
    /*
    Assertion is done to check if expected data is equals to actual data.
    Green checkmark means PASS
    Yellow X means FAIL
    Assert.assertFalse(false); ==> It will PASS
    Assert.assertFalse(true); ==> It will FAIL

     Assert.assertTrue(true); ==> This will PASS
    Assert.assertTrue(false); ==> This will FAIL

    */

    @Test
    public void assertions(){
        Assert.assertEquals(2, 2);
        Assert.assertEquals("John", "John");
        Assert.assertEquals(true, 3==3);
        Assert.assertEquals(3, 2+1);

        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertFalse("John".contains("X"));

        if ("John".equals("john")){
            //Verification: İf the statement fails, test case will continue to execute
        }
        Assert.assertTrue("Ali".contains("A"));
        Assert.assertFalse("Ayse".equals("ayse"));
    }
}
