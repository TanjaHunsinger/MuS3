package simulation.lib.counter;

import com.sun.javafx.geom.transform.GeneralTransform3D;

import simulation.lib.counter.*;
/**
 * This class implements a discrete time confidence counter
 */
public class DiscreteConfidenceCounter {
	/*
	 * TODO Problem 3.1.2 - implement this class according to the given class diagram!
	 * Hint: see section 4.4 in course syllabus
	 */

	public double alpha = 0.05; //default wert

	/**
	 * anhand des alpha wertes wird die row berechnet
	 * @return row
	 */
	public int getRow() {
		int row = 0;

		if (alpha < 0.05) {
			row = 1;			
		}
		else if (alpha >= 0.05 && alpha < 0.1) {
			row = 2;
		}
		else {
			row = 3;
		}

		return row;
	}

	public double getT(double numSamples) {
		double value = 0;

		//abfrage deegrees of freedom im angegebenen bereich ist
		if (numSamples > 1 && numSamples < 1000000 ) {
			for (int i = 0; i < tAlphaMatrix.length; i++) {
				if(tAlphaMatrix[0][i] == numSamples) {
					value = tAlphaMatrix[getRow()][i];
				}
				else interPol(numSamples);
			}
			
		}

		return value;
	}

	public double interPol(double numSamples) {
		double value = 0;

		double temp = (numSamples - tAlphaMatrix[0][0])/tAlphaMatrix[0][tAlphaMatrix.length] * (tAlphaMatrix.length -1);
		System.out.println(temp);

		if (numSamples <= temp) {
			for (int j = 0; j < temp; j++) {
				if (numSamples == tAlphaMatrix[0][j]) {
					value = tAlphaMatrix[getRow()][j+1];
				}
			}
		}
		else if (numSamples > temp) {
			for (int j = 0; j < tAlphaMatrix.length; j++) {
				if (numSamples == tAlphaMatrix[0][j]) {
					value = tAlphaMatrix[getRow()][j+1];
				}
			}
		}
		return value;
	}

	/*	Row 1: degrees of freedom
	 *  Row 2: alpha 0.01
	 *  Row 3: alpha 0.05
	 *  Row 4: alpha 0.10
	 */

	private double tAlphaMatrix[][] = new double[][]{
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 1000000},
		{63.657, 9.925, 5.841, 4.604, 4.032, 3.707, 3.499, 3.355, 3.250, 3.169, 2.845, 2.750, 2.704, 2.678, 2.660, 2.648, 2.639, 2.632, 2.626, 2.576},
		{12.706, 4.303, 3.182, 2.776, 2.571, 2.447, 2.365, 2.306, 2.262, 2.228, 2.086, 2.042, 2.021, 2.009, 2.000, 1.994, 1.990, 1.987, 1.984, 1.960},
		{6.314, 2.920, 2.353, 2.132, 2.015, 1.943, 1.895, 1.860, 1.833, 1.812, 1.725, 1.697, 1.684, 1.676, 1.671, 1.667, 1.664, 1.662, 1.660, 1.645}};

		/**
		 * @see Counter#report()
		 * Uncomment this function when you have implemented this class for reporting.
		 */
		/** @Override
    public String report() {
        String out = super.report();
        out += ("" + "\talpha = " + alpha + "\n" +
                "\tt(1-alpha/2) = " + getT((getNumSamples() - 1)) + "\n" +
                "\tlower bound = " + getLowerBound() + "\n" +
                "\tupper bound = " + getUpperBound());
        return out;
    } */

		/**
		 * @see Counter#csvReport(String)
		 * Uncomment this function when you have implemented this class for reporting.
		 */
		/**	@Override
    public void csvReport(String outputdir) {
        String content = observedVariable + ";" + getNumSamples() + ";" + getMean() + ";" + getVariance() + ";" + getStdDeviation() + ";" +
                getCvar() + ";" + getMin() + ";" + getMax() + ";" + alpha + ";" + getT(getNumSamples() - 1) + ";" + getLowerBound() + ";" +
                getUpperBound() + "\n";
        String labels = "#counter ; numSamples ; MEAN; VAR; STD; CVAR; MIN; MAX;alpha;t(1-alpha/2);lowerBound;upperBound\n";
        writeCsv(outputdir, content, labels);
  }
		 */

}
