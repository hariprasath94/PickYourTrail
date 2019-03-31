import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
class CountPairs{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long inputArr[] = new long[n];
		for(int i = 0; i < n;i++) {
			inputArr[i] = sc.nextLong();
		}
		long k = sc.nextLong();
		System.out.println(countPairs(inputArr,k));
	}
 
	private static int countPairs(long[] inputArr, long k) {
		int count = 0;
		Set<Long> dataSet = new HashSet<>();
		for(int i = 0; i < inputArr.length;i++) {
			dataSet.add(inputArr[i]);
		}
 
		for(Long d : dataSet) {
			if (dataSet.contains(d + k)) {
				++count;
			}
		}
 
		return count;
	}
}
