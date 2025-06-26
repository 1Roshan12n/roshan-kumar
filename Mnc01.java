package GPOtest;
import java.util.*;
public class Mnc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		if(0<=n && m<=9999) {
		for(int i=n;i<=m;i++) {
			sum=sum+i;
			
		}System.out.println(sum);
		}else {
			System.err.println("Invalid Input");

	}

}
}
