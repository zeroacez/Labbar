package labb3;

import java.util.Scanner;
import java.util.InputMismatchException;
import lincalc.LinCalcJohn;

public class LinCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double answer = 0;
		
//		System.out.println("LinCalc, mata in matematiska uttryck: ");
//		String uttryck = scan.nextLine();
//		String[] result = ArrayMaker(uttryck);
		
		String[] result = ArrayMaker("4 * 3.1 + 2");
		
		result = LinCalcJohn.toPostfix(result);
		answer = LinCalcJohn.calc(result);
		
		System.out.println(result[1]);
	
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);		
		}
		
		System.out.println("\n" + answer);
		
	}
	static String[] ArrayMaker(String _uttryck){
		
		
		_uttryck = _uttryck.replaceAll("\\s", ""); //Tar bort alla "whitespaces"
		_uttryck = _uttryck.replaceAll(",", "."); // Byter ut alla punkter mot komman
	//	_uttryck = _uttryck.replaceAll("-", "+-"); // Byter	 ut alla - mot +-
		
		String[] _result = _uttryck.split("(?<=[+*/(^)])|(?=[-+*/(^)])"); // MASTER uttryck, lookbehind(?<=), | (X or Y), lookahead (?=), character classes ([]).
		return _result;
	}
	static boolean ParseChecker(String pos){
		if(Double.valueOf(pos) <= 0 || Double.valueOf(pos) >= 0) return true; 
		return false;
	}
	static String[] PostFix(String[] _result) {
		
		return _result;
	}
}
