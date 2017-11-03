package study;

import simulation.lib.counter.DiscreteConfidenceCounter;
import simulation.lib.counter.DiscreteCounter;
import simulation.lib.randVars.continous.Normal;

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
        DiscreteCounter test1 = new DiscreteCounter(" ");
        //System.out.println("Test getT: ");
        //System.out.println("alpha " + test.alpha);
        //System.out.println("result " + test.getT(1000000) + "\n");
        

        //System.out.println("alpha1 " + test.alpha);
        //System.out.println("result1 " + test.getT(5.0578365) + "\n");
        
        //System.out.println("alpha1 " + test.alpha);
        //System.out.println("result1 " + test.getT(10) + "\n");
        
        
        //System.out.println(test.report());
        
        Normal norm = new Normal(null);
        //======= alpha = 0.1 ========//
        test.alpha = 0.1;
        //normal: mean 10, cvar 0.25
        norm.setMeanAndCvar(10, 0.25);
        //System.out.println(norm.toString());
        System.out.println(test.report());
        
      //normal: mean 10, cvar 0.5
        norm.setMeanAndCvar(10, 0.5);
        //System.out.println(norm.toString());
      //normal: mean 10, cvar 1
        norm.setMeanAndCvar(10, 1);
        //System.out.println(norm.toString());
      //normal: mean 10, cvar 2
        norm.setMeanAndCvar(10, 2);
        //System.out.println(norm.toString());
      //normal: mean 10, cvar 4
        norm.setMeanAndCvar(10, 0.25);
        //System.out.println(norm.toString());
        
        
        
    }
}
