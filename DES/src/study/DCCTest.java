package study;

import simulation.lib.counter.DiscreteConfidenceCounter;

/*
 * TODO Problem 3.1.3 and 3.1.4 - implement this class
 */
public class DCCTest {

    public static void main(String[] args) {
        testDCC();
        DiscreteConfidenceCounter test = new DiscreteConfidenceCounter();
        System.out.println("result " + test.getT(1000000));
        System.out.println("alpha " + test.alpha);

        System.out.println("alpha1 " + test.alpha);
        System.out.println("result1 " + test.getT(5.0578365));
        
        System.out.println("alpha1 " + test.alpha);
        System.out.println("result1 " + test.getT(1000003));
    }

    public static void testDCC() {
        // TODO Auto-generated method stub
    }
}
