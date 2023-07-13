import java.util.Scanner;

public class DaysofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Lets Print the days of week");
System.out.println("Enter the number for the day");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
switch(n) {
case 1:
	System.out.println("sunday");
	break;
case 2:
	System.out.println("monday");
	//no break ,execute and check the o/p
case 3:
	System.out.println("tuesday");
case 4:
	System.out.println("wednesday");
	break;
case 5:
	System.out.println("thursday");
case 6:
	System.out.println("friday");
case 7:
	System.out.println("Saturday");
//theres no default 
	//check with number 8 as input
}
	}

}
