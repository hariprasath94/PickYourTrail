import java.io.*; 
import java.util.*;
class TestClass { 
    static int minUniqueSum(int arr[], int n) 
    { 
        int sum = arr[0], prev = arr[0]; 
        for (int i = 1; i < n; i++) { 
            if (arr[i] <= prev) { 
                prev = prev + 1; 
                sum = sum + prev; 
            }
            else { 
                sum = sum + arr[i]; 
                prev = arr[i]; 
            } 
        } 
        return sum; 
    } 
    public static void main (String[] args) { 
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = s.nextInt();
        System.out.println(minUniqueSum(arr, n)); 
    } 
} 
  
