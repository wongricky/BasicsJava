package basicJava;

import java.util.ArrayList;

public class BasicJava {
	
	// Print 1 - 255
	public void get1To255(int num) {
		for (int i = 0; i <= num; i ++) {
			System.out.println(i);
		}
	}
	
	// Print odd 1 - 255
	public void get1To255Odd(int num) {
		for (int i = 0; i <= num; i ++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	// Print Sum 
	public void getSum(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i ++) {
			sum += i;
			System.out.println(String.format("New Number: %03d Sum %d", i, sum));
		}
	}
	
	// Iterate array
	public void getIterateArray(int [] x) {
		for (int i = 0; i < x.length; i ++) {
			System.out.println(x[i]);
		}
	}
	
	// Find max
	public int getMax(int [] x) {
		int max = x[0];
		for (int i = 0; i < x.length; i ++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	
	// Get average
	public int getAverage(int [] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i ++) {
			sum += x[i];
		}
		return (sum / x.length);
	}

	
	// Odd array
	public ArrayList<Integer> getOddArray(int num){
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i <= num; i ++) {
			if (i%2 != 0) {
				y.add(i);
			}
		}
		return y;
	}
	
	// Greater than y
	public int getGreaterThanY(int [] x, int y) {
		int counter = 0;
		for (int i = 0; i < x.length; i ++) {
			if (x[i] > y) {
				counter ++;
			}
		}
		return counter;
	}
	
	// Square the values
	public ArrayList<Integer> getSquaredValue(int [] x){
		ArrayList<Integer> square = new ArrayList<Integer>();
		for (int i = 0; i < x.length; i ++ ) {
			int sq = (int)Math.pow(x[i],2);
			square.add(sq);
		}
		return square;
	}
	
	// Eliminate negative numbers
	public ArrayList<Integer> getPositiveNumbers(int [] x){
		ArrayList<Integer> positive = new ArrayList<Integer>();
		for (int i = 0; i < x.length; i ++) {
			if (x[i] > 0) {
				positive.add(x[i]);
			}
			else if (x[i] <= 0) {
				positive.add(0);
			}
		}
		return positive;
	}
	
	// Min Max Avg
	public ArrayList<Integer> getMMA(int [] x){
		ArrayList<Integer> MMA = new ArrayList<Integer>();
		int max = x[0];
		int min = x[0];
		int sum = 0; 
		for (int i = 0; i < x.length; i ++) {
			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min) {
				min = x[i];
			}
			sum += x[i];
		}
		int avg = (sum / x.length);
		MMA.add(max);
		MMA.add(min);
		MMA.add(avg);
		return MMA;
	}
	
	// Shifting Values
	public ArrayList<Integer> shiftValues(int [] x){
		ArrayList<Integer> shift = new ArrayList<Integer>();
		for (int i = 0; i < x.length; i ++) {
			if (i != x.length - 1) {
				x[i] = x[i + 1];
				shift.add(x[i]);
			}
			else {
				x[i] = 0;
				shift.add(x[i]);
			}
		}
		return shift;
	}
	
	
	
	
	
	
}
