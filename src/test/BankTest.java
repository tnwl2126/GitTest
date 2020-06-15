package test;

import java.text.DecimalFormat;
import java.util.Scanner;


public class BankTest {
	Scanner input = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("###,###.##");
	int total = 10000;
	
	public static void main(String[] args) {
		BankTest bank = new BankTest();
		
		System.out.println("계좌 123-456789 (예금주 : 홍길동)");
		System.out.println("잔액 : 10,000원");
		bank.start();
	}
	
	public void start() {
		int num = 0;
		
		while(num < 3) {
			System.out.println("\n==============\n1. 입금\n2. 출금");
			num = input.nextInt();
			
			if(num==1)total += add();
			else if(num==2) total -= sub();
			
			System.out.println("잔액 : "+ formatter.format(total));
		}
		System.out.println("프로그램 종료");		
	}
	
	public int add() {
		int num = 0;
		
		System.out.print("잔액 : ");
		num = input.nextInt();
		
		if(num < 0)System.out.println("금액은 음수를 입력할 수 없습니다.\n");
		
		else 		
			System.out.println(formatter.format(num)+"원 입금합니다.\n");
		
		return num;
	}
	
	public int sub() {
		int num = 0;
		System.out.print("잔액 : ");
		num = input.nextInt();
		
		if(num > total) {
			System.out.println("출금잔액 부족\n");
			num = 0;
		}	
		else if(num < 0)System.out.println("금액은 음수를 입력할 수 없습니다.\n");
		
		else 	System.out.println(formatter.format(num)+"원 출금합니다.\n");
		
		return num;
	}
}

