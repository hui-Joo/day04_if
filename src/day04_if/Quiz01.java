package day04_if;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 1.
		int a;
		System.out.println("�����Է� : ");
		a = input.nextInt();
		
		if(a >= 90 && a <= 100) {
			System.out.println("A �Դϴ�.");
		}else if(a >= 80 && a <= 89) {
			System.out.println("B �Դϴ�.");
		}else if(a >= 70 && a <= 79) {
			System.out.println("C �Դϴ�.");
		}else if(a >= 60 && a <= 69) {
			System.out.println("D �Դϴ�.");
		}else if(a <= 59){
			System.out.println("F �Դϴ�.");
		}
		
		
		//2.
		int b;
		System.out.println("���� �Է�: ");
		b = input.nextInt();
		
		if(b%2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
		// 3.
		int m;
		System.out.println("�� ���ΰ���? : ");
		m = input.nextInt();
		
		if(m >= 11 && m <= 12) {
			System.out.println("�ܿ��Դϴ�.");
		}else if(m >= 1 && m <= 2) {
			System.out.println("�ܿ��Դϴ�.");
		}else if(m >= 3 && m <= 5) {
			System.out.println("���Դϴ�.");
		}else if(m >= 6 && m <= 8) {
			System.out.println("�����Դϴ�.");
		}else if(m >= 9 && m <= 10) {			
			System.out.println("�����Դϴ�.");
		}
		
		// 4.

			double h, w, bmi;
			System.out.println("Ű : ");
			h = input.nextDouble();
			System.out.println("������ : ");
			w = input.nextDouble();
			
			bmi = w / (h*h);
			
			if(bmi < 18.5) {
				System.out.println("��ü���Դϴ�.");
			}else if(bmi >= 18.5 && bmi <= 24.9) {
				System.out.println("�����Դϴ�.");
			}else if(bmi >= 25) {
				System.out.println("���Դϴ�.");
			}
				
		// 5.
			
			int age;
			System.out.println("�� ��? : ");
			age = input.nextInt();
			
			if(age > 0 && age <= 8) {
				System.out.println("1000��");
			}else if(age >= 9 && age <= 14) {
				System.out.println("1500��");
			}else if(age >= 15 && age <= 17) {
				System.out.println("3000��");
			}else if(age > 17 && age <= 100) {
				System.out.println("5000��");
			}
		

	}

}
