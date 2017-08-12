package com.hand.two;

import java.util.Scanner;

public class ShowDatetime {
public static void main(String[] args) {
	int year;
	int month;
	int day;
	int dates;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("输入年：");
			year =sc.nextInt();
			System.out.print("输入月：");
			month =sc.nextInt();
			System.out.print("输入日：");
			day =sc.nextInt()+1;
			if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
				System.out.println("输入错误，请重新输入！"); 
			}
			
			if(((year%4==0 && year%100!=0)||(year%400==0) && month == 2)){
				System.out.println(year +"-"+ month +"-"+ day);
				
			}else if(month == 2 && day>=29){
				day = day-1;
				System.out.println("格式错误");
			}
			System.out.println(year +"-"+ month +"-"+ day);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
