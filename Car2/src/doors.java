import java.io.Serializable;
import java.util.Scanner;
@SuppressWarnings("serial")
public class doors implements Serializable{
		int model;
		String colour;
		Scanner sc=new Scanner(System.in);
		void getVal(){
			System.out.println("---------------------doors---------------------");
			 System.out.print("Enter the model number:");
			 this.model=sc.nextInt();
			 System.out.print("Enter the colour of door:");
			 this.colour=sc.next();
		}
}
