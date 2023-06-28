import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Switch Demo
 * Switch,If Else-> Selection statements
 * 
 */
	//program to do arithmetic operation
System.out.println("Welcome");
		System.out.println("Enter two numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		//to get char input
		System.out.println("enter the operator");
		char operator=s.next().charAt(0);
		switch(operator) {
		case '+':
			System.out.println("Addition: "+(a+b));
			break;//if no break compiler executes all other cases 
			//after the validated case
			//try without break
		case '-':
			System.out.println("subtraction: "+(a-b));
			break;
		case '*':
			System.out.println("multiplication: "+(a*b));
			break;
		case '/':
			System.out.println("Division: "+(a/b));
			break;
		case '%':
			System.out.println("Modulo: "+(a%b));
			break;
		default://not necessarily to be written at last
			//can be written b4 1st case also
			System.out.println("wrong operator entered");
			break;//Not mandatory
		}
		
	}

}
