package com.hand.one;

import java.io.IOException;
import java.util.Scanner;

public class Sal {
	
public static void main(String[] args) {
	double money = 0;
	int i;
	try {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入工资:");
		i=sc.nextInt();
		if(i<1500){
			money = (i * 0.03);
		}else if(i>1500 && i<4500){
			money = (i-1500) * 0.1;
		}else if(i>4500 && i<9000){
			money = (i-4500) * 0.2;
		}else if(i>9000 && i<35000){
			money = (i-9000) * 0.25;
		}else if(i>35000 && i<55000){
			money = (i-35000) * 0.3;
		}else if(i>55000 && i<80000){
			money = (i-55000) * 0.35;
		}else if(i>80000 ){
			money = (i-80000) * 0.45;
		}
		System.out.println("所需要缴纳的税费为："+money);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
