package hackerrank;

import java.text.DecimalFormat;
import java.util.List;

public class Cake {

	
	static double PI = 3.14159265359d;
	public static void main(String args[]) {
//		int[] radii = new int[] {4,3,3};
//		System.out.println(largestPiece(radii, 3));
	}
	
	
    private static double getArea(int radius) {
		return PI * radius * radius;
	}

	public static String largestPiece(List<Integer> radii, int numberOfGuests) {
		for(int j=0;j<radii.size();j++) {
			int current = radii.get(j);
			double maxArea = getArea(current);
			for(int i=1;i<=numberOfGuests;i++) {
				if(getMaxCuttableCount(radii,maxArea/i)== numberOfGuests){
					return format(maxArea/i);
				}
			}
		}
		return null;
    }


	private static String format(double number) {
		DecimalFormat dec = new DecimalFormat("#.0000");
		return dec.format(number);
	}
	
	private static int getMaxCuttableCount(List<Integer> radii, double area) {
		int count =0;
		for(int i=0;i<radii.size();i++) {
			double thisArea = getArea(radii.get(i));
			if(thisArea >= area) {
				count += (thisArea / area);
			}
		}
		return count;
	}
}
