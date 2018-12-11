package com.iqi.devops;

import junit.framework.TestCase;

import java.util.List;

public class HelloTest extends TestCase {

    public void testPrimeNumbersBruteForce()
    {
        List<Integer> result = Hello.primeNumbersBruteForce(3);
        assertTrue(result.size()==2);
    }

    public void testIsPrimeBruteForce()
    {
        assertTrue(Hello.isPrimeBruteForce(3));
        assertFalse(Hello.isPrimeBruteForce(4));
    }

//    public void testSieveOfEratosthenes()
//    {
//        List<Integer> result = Hello.sieveOfEratosthenes(100);
//        assertFalse(result.isEmpty());
//    }
}