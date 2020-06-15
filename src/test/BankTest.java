package test;

import java.text.DecimalFormat;
import java.util.Scanner;


public class BankTest {
	Scanner input = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("###,###.##");
	int total = 10000;
	
	public static void main(String[] args) {
		BankTest bank = new BankTest();
		
		System.out.println("���� 123-456789 (������ : ȫ�浿)");
		System.out.println("�ܾ� : 10,000��");
		bank.start();
	}
	
	public void start() {
		int num = 0;
		
		while(num < 3) {
			System.out.println("\n==============\n1. �Ա�\n2. ���");
			num = input.nextInt();
			
			if(num==1)total += add();
			else if(num==2) total -= sub();
			
			System.out.println("�ܾ� : "+ formatter.format(total));
		}
		System.out.println("���α׷� ����");		
	}
	
	public int add() {
		int num = 0;
		
		System.out.print("�ܾ� : ");
		num = input.nextInt();
		
		if(num < 0)System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.\n");
		
		else 		
			System.out.println(formatter.format(num)+"�� �Ա��մϴ�.\n");
		
		return num;
	}
	
	public int sub() {
		int num = 0;
		System.out.print("�ܾ� : ");
		num = input.nextInt();
		
		if(num > total) {
			System.out.println("����ܾ� ����\n");
			num = 0;
		}	
		else if(num < 0)System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.\n");
		
		else 	System.out.println(formatter.format(num)+"�� ����մϴ�.\n");
		
		return num;
	}
}

