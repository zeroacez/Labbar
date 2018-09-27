package labb3;

import java.util.Scanner;
import java.util.InputMismatchException;
import lincalc.LinCalcJohn;

public class LinCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("LinCalc, mata in matematiska uttryck: ");
		String uttryck = scan.nextLine();

		String[] result = Lek(uttryck);
		
	//	String[] operander =  

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			
		}
		
	}
	static String[] Lek(String _uttryck){
		
		_uttryck = _uttryck.replaceAll("\\s", ""); //Tar bort alla "whitespaces"
		_uttryck = _uttryck.replaceAll(",", "."); // Byter ut alla punkter mot komman
	//	_uttryck = _uttryck.replaceAll("-", "+-"); // Byter ut alla - mot +-
	//	_uttryck = _uttryck.replaceAll()
		
		String[] _result = _uttryck.split("(?<=[+*/(^)])|(?=[-+*/(^)])"); // MASTER uttryck, lookbehind(?<=), | (X or Y), lookahead (?=), character classes ([]).
		return _result;
	}
	static char MemberOf(String list, char pos){
		for(int i = 0; i < list.length(); i++){
			if(list.charAt(i) == pos) return list.charAt(i); 
		}
		return 0;
	}
}
