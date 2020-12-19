package com.t1gerok.config;

import org.junit.Assert;
import org.junit.Test;

public class TestDroolsConfig {

    @Test
    public void testGetKieSession() {
        Assert.assertNotEquals(null, new DroolsConfig().getKieSession());
    }
}
