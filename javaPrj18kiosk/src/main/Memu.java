package main;

import java.util.Scanner;

public class Memu {

	public int burgerMenu() {

		//메뉴 선택 (버거) 메뉴판 보여주고 입력 받기
		System.out.println("==============햄버거==============");
		System.out.println("1. "+ Main.BURGER01);
		System.out.println("2. "+ Main.BURGER02);
		System.out.println("3. "+ Main.BURGER03);
		return Main.sc.nextInt();
			
			
	}
	
	public void sideMemu() {
		System.out.println("==============사이드==============");
		System.out.println("1. "+ Main.SIDE01);
		System.out.println("2. "+ Main.SIDE02);
		System.out.println("3. "+ Main.SIDE03);
		int side = Main.sc.nextInt();
	}
}
