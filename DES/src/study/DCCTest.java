package study;

import simulation.lib.counter.DiscreteConfidenceCounter;
import simulation.lib.counter.DiscreteCounter;

/*
 * TODO Problem 3.1.3 and 3.1.4 - implement this class
 */
public class DCCTest {

    public static void main(String[] args) {
        testDCC();
        
    }

    public static void testDCC() {
        // TODO Auto-generated method stub
    	DiscreteConfidenceCounter test = new DiscreteConfidenceCounter();
        
        System.out.println("Test getT: ");
        System.out.println("alpha " + test.alpha);
        System.out.println("result " + test.getT(1000000) + "\n");
        

        System.out.println("alpha1 " + test.alpha);
        System.out.println("result1 " + test.getT(5.0578365) + "\n");
        
        System.out.println("alpha1 " + test.alpha);
        System.out.println("result1 " + test.getT(10) + "\n");
        
        
        System.out.println(test.report());
    }
}
