package ch07.ex04.case05.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg + ": ");
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자가 아닙니다.");
		} while(!isGood);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[0-9]+");
			if(!isGood) Console.err("0 이상의 정수가 아닙니다.");
		}while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	
	/*static void info(Object obj) {
		System.out.println(obj);
	}
	
	static int inInt(String msg) {
		boolean isGood = false;
		boolean isGood2 = false;
		int num = 0;
		do {
			System.out.print(msg + "\n> ");
			String tmp = sc.nextLine();
			isGood = tmp.matches("^[1-9][0-9]+");
			isGood2 = tmp.matches("[0]");
			if(isGood) num = Integer.parseInt(tmp);
			if(isGood2) num = Integer.parseInt(tmp);
			isGood = num <= 100;
			if(!isGood && !isGood2) System.out.println("ERROR] 100이하 정수로 입력하세요.");
		}while(!isGood || !isGood2);
		return num;
	}*/
	
}
