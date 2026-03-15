package Day_2;

public class Program1 {
	public static void main(String[] args) {
		int n1=6,n2=2,gcd=0;
		for(int i=1; i<=n1 && i<=n2; i++) {
			if(n1 % i==0 && n2 % i==0) {
				gcd=i;
			}
		}
		int lcm=(n1*n2)/gcd;
		System.out.println(lcm);
	}
}
