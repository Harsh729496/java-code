package firstproject;

import java.util.Scanner;

public class Firstclass {
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		int no1, no2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number:");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		float ans = (float) no1/no2;
		System.out.println(ans);
		
		if(no1>90) {
			System.out.println("Grade A");
		}
		if(no1>80 && no1<90) {
			System.out.println("Grade B");
		}
		if(no2<80) {
			System.out.println("Grade C");
		}
	}

}