package EDX;
import java.util.ArrayList;

public class Lynx {

	private static double[] preyPred = new double[2];
	final static double A1 = 0.1;
	final static double A2 = 0.01;
	final static double B1 = 0.01;
	final static double B2 = 0.00002;
	private static double[] L = new double[2];
	private static double[] H = new double[2];
	private static double[] a = new double[2];
	private static double[] b = new double[2];

	static double[] preyPredLV(double[] preyPred, double[] a, double[] b, int n) {
		// L[0] * (1 - b1 +b2*H[0]) formula to calculate hares population
		for (int i = 0; i < n; i++) {
			int count = 0;
			L[count + 1] = L[count] * (1 - B1 + B2 * H[count]);
			L[0] = L[1];
		}
		// H[0] * (1 + a1 - a2*L[0]) formula to calculate lynx population
		for (int i = 0; i < n; i++) {
			int count = 0;
			H[count + 1] = H[count] * (1 + A1 - A2 * L[count]);
			H[0] = H[1];

		}

		preyPred[0] = L[0];
		preyPred[1] = H[0];

		return preyPred;
	}

	public static void main(String[] args) {
		L[0] = 20;
		H[0] = 300;
		preyPred[0] = L[0];
		preyPred[1] = H[0];

		preyPredLV(preyPred, a, b, 2);
		// Print the result
		for (double x : preyPred) {
			System.out.println(x);
		}

	}
}
