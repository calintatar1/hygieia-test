package com.iqi.devops;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Hello
{
    final static Logger logger = Logger.getLogger(Hello.class);
    public static void main(String[]args)
    {
        System.out.println("Let's begin.");

    }

    public static void logMe(String message, long iterations)
    {
        for(int i=0;i<iterations;i++)
        {
            logger.debug("This is a debug message: "+message+" id:"+ Thread.currentThread().hashCode());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                logger.error("I was sleeping and now I'm not!");
            }
        }
    }

    public static List<Integer> primeNumbersBruteForce(int n) {
        LinkedList<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
    public static boolean isPrimeBruteForce(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static List<Integer> sieveOfEratosthenes(int n) {
//        boolean prime[] = new boolean[n + 1];
//        Arrays.fill(prime, true);
//        for (int p = 2; p * p <= n; p++) {
//            if (prime[p]) {
//                for (int i = p * 2; i <= n; i += p) {
//                    prime[i] = false;
//                }
//            }
//        }
//        List<Integer> primeNumbers = new LinkedList<>();
//        for (int i = 2; i <= n; i++) {
//            if (prime[i]) {
//                primeNumbers.add(i);
//            }
//        }
//        return primeNumbers;
//    }
}
