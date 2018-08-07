package com.xuan.test;

import static org.junit.Assert.assertTrue;

import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    // the error isn't shown in logs
    public void testErrorOutputByTest()
    {
        assertTrue(true);
        System.err.println("Error output by tests.");
    }

    @Test
    public void testIllegalStacktrace()
    {
        String output = String.join("", Collections.nCopies(500000, "Test illegal message>a"));
        throw new InvalidParameterException(output);
    }
}
