import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Its all about vowels");
   System.out.println("Enter the alphabet:\n");
   Scanner s=new Scanner(System.in);
   char alphabet=s.next().charAt(0);
   switch(alphabet) {
   default:
	   System.out.println("Its a consonant");
	   break;//Is necessary when default is written first
   case 'a':
   case 'e':
   case 'i':
   case 'o':
   case 'u':
	  System.out.println("It is a vowel");
	  break;

   }
	}

}
