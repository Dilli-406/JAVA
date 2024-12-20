import java.util.Scanner;

class Questions1{
	Scanner sc=new Scanner(System.in);
	int points=0;
	void q1() {
		System.out.println("1.1+1? ");
		System.out.println("a) 0");
		System.out.println("b) 4");
		System.out.println("c) 2");
		System.out.println("d) 0");
		System.out.println("e) Lifeline");
		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "b":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "c":
			System.out.println("Correct Answer");
			points++;
			q2();
			break;
		case "d":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;	
		default:
			System.out.println("Enter a valid input");
			q1();
		}

	}
	
	void q2() {
		System.out.println("2. 1+2=? ");
		System.out.println("a) 1");
		System.out.println("b) 4");
		System.out.println("c) 2");
		System.out.println("d) 3");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "b":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "c":
			System.out.println("wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "d":
			System.out.println("Correct Answer");
			points++;
			q3();
			break;	
		default:
			System.out.println("Enter a valid input");
			q2();
		}

	}
	void q3() {
		System.out.println("3. 1+3=? ");
		System.out.println("a) 1");
		System.out.println("b) 4");
		System.out.println("c) 2");
		System.out.println("d) 3");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "b":
			System.out.println("correct Answer");
			points++;
			q4();
			break;
		case "c":
			System.out.println("wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "d":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;	
		default:
			System.out.println("Enter a valid input");
			q3();
		}

	}
	void q4() {
		System.out.println("4. 1+4=? ");
		System.out.println("a) 1");
		System.out.println("b) 4");
		System.out.println("c) 5");
		System.out.println("d) 3");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "b":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "c":
			System.out.println("Correct Answer");
			points++;
			q5();
			break;
		case "d":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;	
		default:
			System.out.println("Enter a valid input");
			q4();
		}

	}
	void q5() {
		System.out.println("5. 1+5=? ");
		System.out.println("a) 1");
		System.out.println("b) 4");
		System.out.println("c) 2");
		System.out.println("d) 6");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "b":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "c":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "d":
			System.out.println("Correct Answer");
			points++;
			q6();
			break;	
		default:
			System.out.println("Enter a valid input");
			q5();
		}

	}
	void q6() {
		System.out.println("6. 1+6=? ");
		System.out.println("a) 7");
		System.out.println("b) 4");
		System.out.println("c) 2");
		System.out.println("d) 3");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("correct Answer");
			points++;
			q7();
			break;
		case "b":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "c":
			System.out.println("wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "d":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;	
		default:
			System.out.println("Enter a valid input");
			q6();
		}

	}
	void q7() {
		System.out.println("7. 1+7=? ");
		System.out.println("a) 1");
		System.out.println("b) 8");
		System.out.println("c) 2");
		System.out.println("d) 3");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "b":
			System.out.println("correct Answer");
			points++;
			q8();
			break;
		case "c":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "d":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;	
		default:
			System.out.println("Enter a valid input");
			q7();
		}

	}
	void q8() {
		System.out.println("8. 1+8=? ");
		System.out.println("a) 1");
		System.out.println("b) 4");
		System.out.println("c) 9");
		System.out.println("d) 3");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "b":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "c":
			System.out.println("Correct Answer");
			points++;
			q9();
			break;
		case "d":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;	
		default:
			System.out.println("Enter a valid input");
			q8();
		}

	}
	void q9() {
		System.out.println("9. 1+9=? ");
		System.out.println("a) 1");
		System.out.println("b) 4");
		System.out.println("c) 2");
		System.out.println("d) 10");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "b":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "c":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "d":
			System.out.println("correct Answer");
			points++;
			q10();
			break;	
		default:
			System.out.println("Enter a valid input");
			q9();
		}

	}
	void q10() {
		System.out.println("10. 1-0=? ");
		System.out.println("a) 1");
		System.out.println("b) 4");
		System.out.println("c) 2");
		System.out.println("d) 3");
		System.out.println("e) Lifeline");

		String o=sc.next();
		switch(o) {
		case "a":
			System.out.println("correct Answer");
			points++;
			System.out.println("Quiz Completed");
			System.out.println("You got c"+points+" points");
			break;
		case "b":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "c":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;
		case "d":
			System.out.println("Wrong Answer");
			System.out.println("You got "+points+" points");
			break;	
		default:
			
			System.out.println("Enter a valid input");
			q10();
		}

	}
}

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Questions1 q=new Questions1();
		q.q1();
	}

}
