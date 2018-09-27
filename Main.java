import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		final String operator = "+-*/()%";
		final String operander = "0123456789";
		float term1 = 0;
		String mathSign = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("LinCalc, mata in matematiska uttryck: ");
		String uttryck = scan.nextLine();
		
		for (int i = 0; i < uttryck.length(); i++){
				mathSign += MemberOf(operator, uttryck.charAt(i));
			}
		System.out.println(mathSign);
		}

	static char MemberOf(String list, char pos) {
		for (int i = 0; i < list.length(); i++) {
			if (list.charAt(i) == pos)
				return list.charAt(i);
		}
		return 0;
	}
}
