package GPOtest;
import java.util.*;
public class Mnc02 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);    
	        int n = scanner.nextInt();
	        int[] arr = new int[n];	    
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int m = scanner.nextInt();
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            if (i >= 2) {
	                for (int j = 2; j <= i / 2; j++) {
	                    if (i % j == 0) {
	                        count++;
	                    }
	                }
	            }  
	            if (m == 1 && i >= 2 && count == 0) {
	                sum += arr[i];
	            }
	            if (m == 2 && (i < 2 || count > 0)) {
	                sum += arr[i];
	            }
	        }	     
	        System.out.println(sum);
	        scanner.close();
		}
	}

