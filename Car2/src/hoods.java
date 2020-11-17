import java.io.Serializable;
import java.util.Scanner;
@SuppressWarnings("serial")
public class hoods implements Serializable{
		int model;
		String colour;
		Scanner sc=new Scanner(System.in);
		void getVal(){
			System.out.println("---------------------hoods---------------------");
			 System.out.print("Enter the model number:");
			 this.model=sc.nextInt();
			 System.out.print("Enter the colour of hood:");
			 this.colour=sc.next();
		}
}
