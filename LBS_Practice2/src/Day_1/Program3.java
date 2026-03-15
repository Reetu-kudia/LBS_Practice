package Day_1;

public class Program3 {
	public static void main(String[] args) {
		int num=121,reverse=0;
		int n=num;
		while(num!=0) {
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(n==reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
