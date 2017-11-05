package study;

import java.text.DecimalFormat;

import simulation.lib.counter.Counter;
import simulation.lib.counter.DiscreteConfidenceCounter;
import simulation.lib.counter.DiscreteCounter;
import simulation.lib.randVars.continous.*;
import simulation.lib.randVars.*;
import simulation.lib.rng.*;

/*
 * TODO Problem 3.1.3 and 3.1.4 - implement this class
 */
public class DCCTest {

	public static void main(String[] args) {
		testDCC();

	}

	public static void testDCC() {

		// TODO Auto-generated method stub
		RNG rng = new StdRNG(); // wird gebraucht um verteilungen aufzurufen

		double alpha_90 = 0.01; // alpha Wert bei 90%
		double alpha_95 = 0.05; // alpha Wert bei 95%
		int nExperiments = 500; // Anzahl an Experimenten

		long numSamples = 100; // {5,10,50,100}

		//w_x_y_z: w = Verteilung, x = Mean, y = cVar, z =alpha . 025 = 0.25 / 05 = 0.5 !!
		//Normalverteilung:
		DiscreteConfidenceCounter norm_10_025_90 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=0.25, alpha=90%", alpha_90);
		DiscreteConfidenceCounter norm_10_025_95 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=0.25, alpha=95%", alpha_95);

		DiscreteConfidenceCounter norm_10_05_90 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=0.5, alpha=90%", alpha_90);
		DiscreteConfidenceCounter norm_10_05_95 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=0.5, alpha=95%", alpha_95);

		DiscreteConfidenceCounter norm_10_1_90 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=1, alpha=90%", alpha_90);
		DiscreteConfidenceCounter norm_10_1_95 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=1, alpha=95%", alpha_95);

		DiscreteConfidenceCounter norm_10_2_90 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=2, alpha=90%", alpha_90);
		DiscreteConfidenceCounter norm_10_2_95 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=2, alpha=95%", alpha_95);

		DiscreteConfidenceCounter norm_10_4_90 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=1, alpha=90%", alpha_90);
		DiscreteConfidenceCounter norm_10_4_95 = new DiscreteConfidenceCounter("Normalverteilung: mean=10, cVar=1, alpha=95%", alpha_95);

		//k-Erlangverteilung:
		DiscreteConfidenceCounter kerlang_10_025_90 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=0.25, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter kerlang_10_025_95 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=0.25, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter kerlang_10_05_90 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=0.5, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter kerlang_10_05_95 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=0.5, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter kerlang_10_1_90 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=1, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter kerlang_10_1_95 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=1, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter kerlang_10_2_90 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=2, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter kerlang_10_2_95 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=2, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter kerlang_10_4_90 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=4, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter kerlang_10_4_95 = new DiscreteConfidenceCounter("k-Erlangverteilung: mean=10, cVar=4, alpha = 95%", alpha_95);

		//Exponentialverteilung:
		DiscreteConfidenceCounter exp_10_025_90 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=0.25, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter exp_10_025_95 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=0.25, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter exp_10_05_90 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=0.5, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter exp_10_05_95 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=0.5, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter exp_10_1_90 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=1, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter exp_10_1_95 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=1, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter exp_10_2_90 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=2, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter exp_10_2_95 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=2, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter exp_10_4_90 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=4, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter exp_10_4_95 = new DiscreteConfidenceCounter("Exponentialverteilung: mean=10, cVar=4, alpha = 95%", alpha_95);

		//Hyperexponentialverteilung:
		DiscreteConfidenceCounter hexp_10_025_90 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=0.25, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter hexp_10_025_95 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=0.25, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter hexp_10_05_90 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=0.5, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter hexp_10_05_95 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=0.5, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter hexp_10_1_90 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=1, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter hexp_10_1_95 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=1, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter hexp_10_2_90 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=2, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter hexp_10_2_95 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=2, alpha = 95%", alpha_95);

		DiscreteConfidenceCounter hexp_10_4_90 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=4, alpha = 90%", alpha_90);
		DiscreteConfidenceCounter hexp_10_4_95 = new DiscreteConfidenceCounter("Hyperexponentialverteilung: mean=10, cVar=4, alpha = 95%", alpha_95);


		// experiment soll 500 mal ausgeführt werden. hier nExperiments = 500
		for(int i = 0; i < nExperiments; i++) {		
			// da es sich hierbei um die Normalverteilung handelt ergibt cVar^2 = var 
			Normal runNormal_10_025 = new Normal(rng, 10, Math.pow(0.25,2));
			Normal runNormal_10_05 = new Normal(rng, 10, Math.pow(0.5,2));
			Normal runNormal_10_1 = new Normal(rng, 10, Math.pow(1,2));
			Normal runNormal_10_2 = new Normal(rng, 10, Math.pow(2,2));
			Normal runNormal_10_4 = new Normal(rng, 10, Math.pow(4,2));

			//k-erlang: var = (1/cvar)^2
			ErlangK runErlang_10_025 = new ErlangK(rng, 10, Math.pow(1/0.25,2));
			ErlangK runErlang_10_05 = new ErlangK(rng, 10, Math.pow(1/0.5,2));
			ErlangK runErlang_10_1 = new ErlangK(rng, 10, Math.pow(1/1,2));
			ErlangK runErlang_10_2 = new ErlangK(rng, 10, Math.pow(1/2,2));
			ErlangK runErlang_10_4 = new ErlangK(rng, 10, Math.pow(1/4,2));

			//exponentialverteilung: 
			Exponential runExp_10 = new Exponential(rng, 10);

			//Hypererxponentialverteilung:
			HyperExponential runHexp_10_025 = new HyperExponential(rng, 10, 0.25);
			HyperExponential runHexp_10_05 = new HyperExponential(rng, 10, 0.5);
			HyperExponential runHexp_10_1 = new HyperExponential(rng, 10, 1);
			HyperExponential runHexp_10_2 = new HyperExponential(rng, 10, 2);
			HyperExponential runHexp_10_4 = new HyperExponential(rng, 10, 4);

			//hier wird anzahl an samples betrachtet
			for( int j = 0; j < numSamples; j++) {
				//Normalverteilung:
				norm_10_025_90.count(runNormal_10_025.getRV());
				norm_10_025_95.count(runNormal_10_025.getRV());

				norm_10_05_90.count(runNormal_10_05.getRV());
				norm_10_05_95.count(runNormal_10_05.getRV());

				norm_10_1_90.count(runNormal_10_1.getRV());
				norm_10_1_95.count(runNormal_10_1.getRV());

				norm_10_2_90.count(runNormal_10_2.getRV());
				norm_10_2_95.count(runNormal_10_2.getRV());

				norm_10_4_90.count(runNormal_10_4.getRV());
				norm_10_4_95.count(runNormal_10_4.getRV());

				//k-Erlangverteilung:
				kerlang_10_025_90.count(runErlang_10_025.getRV());
				kerlang_10_025_95.count(runErlang_10_025.getRV());
				
				kerlang_10_05_90.count(runErlang_10_05.getRV());
				kerlang_10_05_95.count(runErlang_10_05.getRV());

				kerlang_10_1_90.count(runErlang_10_1.getRV());
				kerlang_10_1_95.count(runErlang_10_1.getRV());
				/* liefert keine Ergebnisse
				kerlang_10_2_90.count(runErlang_10_2.getRV());
				kerlang_10_2_95.count(runErlang_10_2.getRV());

				kerlang_10_4_90.count(runErlang_10_4.getRV());
				kerlang_10_4_95.count(runErlang_10_4.getRV());
				*/
				
				//Exponentialverteilung
				exp_10_025_90.count(runExp_10.getRV());
				exp_10_025_95.count(runExp_10.getRV());

				exp_10_05_90.count(runExp_10.getRV());
				exp_10_05_95.count(runExp_10.getRV());

				exp_10_1_90.count(runExp_10.getRV());
				exp_10_1_95.count(runExp_10.getRV());
				
				exp_10_2_90.count(runExp_10.getRV());
				exp_10_2_95.count(runExp_10.getRV());
				
				exp_10_4_90.count(runExp_10.getRV());
				exp_10_4_95.count(runExp_10.getRV());



			}

		}

		// ==========================================================================================================//	
		//berechnet lower und upper bound für Normalverteilung 
		double norm_lowerBound_025_90 = (norm_10_025_90.getLowerBound());
		double norm_upperBound_025_90 = (norm_10_025_90.getUpperBound());

		double norm_lowerBound_025_95 = (norm_10_025_95.getLowerBound());
		double norm_upperBound_025_95 = (norm_10_025_95.getUpperBound());

		double norm_lowerBound_05_90 = (norm_10_05_90.getLowerBound());
		double norm_upperBound_05_90 = (norm_10_05_90.getUpperBound());

		double norm_lowerBound_05_95 = (norm_10_05_95.getLowerBound());
		double norm_upperBound_05_95 = (norm_10_05_95.getUpperBound());

		double norm_lowerBound_1_90 = (norm_10_1_90.getLowerBound());
		double norm_upperBound_1_90 = (norm_10_1_90.getUpperBound());

		double norm_lowerBound_1_95 = (norm_10_1_95.getLowerBound());
		double norm_upperBound_1_95 = (norm_10_1_95.getUpperBound());

		double norm_lowerBound_2_90 = (norm_10_2_90.getLowerBound());
		double norm_upperBound_2_90 = (norm_10_2_90.getUpperBound());

		double norm_lowerBound_2_95 = (norm_10_2_95.getLowerBound());
		double norm_upperBound_2_95 = (norm_10_2_95.getUpperBound());

		double norm_lowerBound_4_90 = (norm_10_4_90.getLowerBound());
		double norm_upperBound_4_90 = (norm_10_4_90.getUpperBound());

		double norm_lowerBound_4_95 = (norm_10_4_95.getLowerBound());
		double norm_upperBound_4_95 = (norm_10_4_95.getUpperBound());


		//Ausgabe Normalverteilung:
		/*
		System.out.println("Verteilung: Normalverteilung ");
		System.out.println("Anzahl Samples: " + numSamples);
		System.out.println("Quantil    alpha   mean  cVar       lower bound          upper bound" );
		System.out.println(" 90%       0.10    10    0.25        " + new DecimalFormat("0.0000").format(norm_lowerBound_025_90) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_025_90));
		System.out.println(" 95%       0.05    10    0.25        " + new DecimalFormat("0.0000").format(norm_lowerBound_025_95) + "               "+ new DecimalFormat("0.0000").format(norm_upperBound_025_95));
		System.out.println(" 90%       0.10    10    0.50        " + new DecimalFormat("0.0000").format(norm_lowerBound_05_90) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_05_90));
		System.out.println(" 95%       0.05    10    0.50       " + new DecimalFormat("0.0000").format(norm_lowerBound_05_95) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_05_95));
		System.out.println(" 90%       0.10    10    1.00        " + new DecimalFormat("0.0000").format(norm_lowerBound_1_90) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_1_90));
		System.out.println(" 95%       0.05    10    1.00        " + new DecimalFormat("0.0000").format(norm_lowerBound_1_95) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_1_95));
		System.out.println(" 90%       0.10    10    2.00        " + new DecimalFormat("0.0000").format(norm_lowerBound_2_90) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_2_90));
		System.out.println(" 95%       0.05    10    2.00        " + new DecimalFormat("0.0000").format(norm_lowerBound_2_95) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_2_95));
		System.out.println(" 90%       0.10    10    4.00        " + new DecimalFormat("0.0000").format(norm_lowerBound_4_90) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_4_90));
		System.out.println(" 95%       0.05    10    4.00        " + new DecimalFormat("0.0000").format(norm_lowerBound_4_95) + "              "+ new DecimalFormat("0.0000").format(norm_upperBound_4_95));
		 */

		// ==========================================================================================================//		
		//berechnet lower und upper bound für k-Erlangverteilung
		double kerlang_lowerBound_025_90 = (kerlang_10_025_90.getLowerBound());
		double kerlang_upperBound_025_90 = (kerlang_10_025_90.getUpperBound());

		double kerlang_lowerBound_025_95 = (kerlang_10_025_95.getLowerBound());
		double kerlang_upperBound_025_95 = (kerlang_10_025_95.getUpperBound());

		double kerlang_lowerBound_05_90 = (kerlang_10_05_90.getLowerBound());
		double kerlang_upperBound_05_90 = (kerlang_10_05_90.getUpperBound());

		double kerlang_lowerBound_05_95 = (kerlang_10_05_95.getLowerBound());
		double kerlang_upperBound_05_95 = (kerlang_10_05_95.getUpperBound());

		double kerlang_lowerBound_1_90 = (kerlang_10_1_90.getLowerBound());
		double kerlang_upperBound_1_90 = (kerlang_10_1_90.getUpperBound());

		double kerlang_lowerBound_1_95 = (kerlang_10_1_95.getLowerBound());
		double kerlang_upperBound_1_95 = (kerlang_10_1_95.getUpperBound());
/*
		double kerlang_lowerBound_2_90 = (kerlang_10_2_90.getLowerBound());
		double kerlang_upperBound_2_90 = (kerlang_10_2_90.getUpperBound());
		
		double kerlang_lowerBound_2_95 = (kerlang_10_2_95.getLowerBound());
		double kerlang_upperBound_2_95 = (kerlang_10_2_95.getUpperBound());

		
		double kerlang_lowerBound_4_90 = (kerlang_10_4_90.getLowerBound());
		double kerlang_upperBound_4_90 = (kerlang_10_4_90.getUpperBound());

		double kerlang_lowerBound_4_95 = (kerlang_10_4_95.getLowerBound());
		double kerlang_upperBound_4_95 = (kerlang_10_4_95.getUpperBound());
		 */
		
		//Ausgabe kErlangverteilung:
		/*
		System.out.println("Verteilung: k-Erlangverteilung ");
		System.out.println("Anzahl Samples: " + numSamples);
		System.out.println("Quantil    alpha   mean  cVar       lower bound          upper bound" );
		System.out.println(" 90%       0.10    10    0.25        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_025_90) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_025_90));
		System.out.println(" 95%       0.05    10    0.25        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_025_95) + "               "+ new DecimalFormat("0.0000").format(kerlang_upperBound_025_95));
		System.out.println(" 90%       0.10    10    0.50        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_05_90) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_05_90));
		System.out.println(" 95%       0.05    10    0.50       " + new DecimalFormat("0.0000").format(kerlang_lowerBound_05_95) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_05_95));
		System.out.println(" 90%       0.10    10    1.00        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_1_90) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_1_90));
		System.out.println(" 95%       0.05    10    1.00        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_1_95) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_1_95));
        //System.out.println(" 90%       0.10    10    2.00        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_2_90) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_2_90));
		//System.out.println(" 95%       0.05    10    2.00        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_2_95) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_2_95));
		//System.out.println(" 90%       0.10    10    4.00        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_4_90) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_4_90));
		//System.out.println(" 95%       0.05    10    4.00        " + new DecimalFormat("0.0000").format(kerlang_lowerBound_4_95) + "              "+ new DecimalFormat("0.0000").format(kerlang_upperBound_4_95));
*/
		
		// ==========================================================================================================//		
				//berechnet lower und upper bound für k-Erlangverteilung
				double exp_lowerBound_025_90 = (exp_10_025_90.getLowerBound());
				double exp_upperBound_025_90 = (exp_10_025_90.getUpperBound());

				double exp_lowerBound_025_95 = (exp_10_025_95.getLowerBound());
				double exp_upperBound_025_95 = (exp_10_025_95.getUpperBound());

				double exp_lowerBound_05_90 = (exp_10_05_90.getLowerBound());
				double exp_upperBound_05_90 = (exp_10_05_90.getUpperBound());

				double exp_lowerBound_05_95 = (exp_10_05_95.getLowerBound());
				double exp_upperBound_05_95 = (exp_10_05_95.getUpperBound());

				double exp_lowerBound_1_90 = (exp_10_1_90.getLowerBound());
				double exp_upperBound_1_90 = (exp_10_1_90.getUpperBound());

				double exp_lowerBound_1_95 = (exp_10_1_95.getLowerBound());
				double exp_upperBound_1_95 = (exp_10_1_95.getUpperBound());
		
				double exp_lowerBound_2_90 = (exp_10_2_90.getLowerBound());
				double exp_upperBound_2_90 = (exp_10_2_90.getUpperBound());
				
				double exp_lowerBound_2_95 = (exp_10_2_95.getLowerBound());
				double exp_upperBound_2_95 = (exp_10_2_95.getUpperBound());

				double exp_lowerBound_4_90 = (exp_10_4_90.getLowerBound());
				double exp_upperBound_4_90 = (exp_10_4_90.getUpperBound());

				double exp_lowerBound_4_95 = (exp_10_4_95.getLowerBound());
				double exp_upperBound_4_95 = (exp_10_4_95.getUpperBound());
				
				
				//Ausgabe kErlangverteilung:
				System.out.println("Verteilung: Exponentialverteilung ");
				System.out.println("Anzahl Samples: " + numSamples);
				System.out.println("Quantil    alpha   mean  cVar       lower bound          upper bound" );
				System.out.println(" 90%       0.10    10    0.25        " + new DecimalFormat("0.0000").format(exp_lowerBound_025_90) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_025_90));
				System.out.println(" 95%       0.05    10    0.25        " + new DecimalFormat("0.0000").format(exp_lowerBound_025_95) + "               "+ new DecimalFormat("0.0000").format(exp_upperBound_025_95));
				System.out.println(" 90%       0.10    10    0.50        " + new DecimalFormat("0.0000").format(exp_lowerBound_05_90) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_05_90));
				System.out.println(" 95%       0.05    10    0.50       " + new DecimalFormat("0.0000").format(exp_lowerBound_05_95) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_05_95));
				System.out.println(" 90%       0.10    10    1.00        " + new DecimalFormat("0.0000").format(exp_lowerBound_1_90) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_1_90));
				System.out.println(" 95%       0.05    10    1.00        " + new DecimalFormat("0.0000").format(exp_lowerBound_1_95) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_1_95));
		      System.out.println(" 90%       0.10    10    2.00        " + new DecimalFormat("0.0000").format(exp_lowerBound_2_90) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_2_90));
				System.out.println(" 95%       0.05    10    2.00        " + new DecimalFormat("0.0000").format(exp_lowerBound_2_95) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_2_95));
				System.out.println(" 90%       0.10    10    4.00        " + new DecimalFormat("0.0000").format(exp_lowerBound_4_90) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_4_90));
				System.out.println(" 95%       0.05    10    4.00        " + new DecimalFormat("0.0000").format(exp_lowerBound_4_95) + "              "+ new DecimalFormat("0.0000").format(exp_upperBound_4_95));
		
	}
}
