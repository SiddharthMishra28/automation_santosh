package com.automationframework.tests;

import com.automationframework.config.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests extends Hooks {

    @Test
    public void testOne() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
    }
}
