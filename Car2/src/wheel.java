import java.io.Serializable;
import java.util.Scanner;
@SuppressWarnings("serial")
public class wheel implements Serializable {
	int size;
	String colour;
	Scanner sc=new Scanner(System.in);
	
	void getVal(){
		
		System.out.println("---------------------wheels---------------------");
		System.out.print("Enter the size wheels:");
		this.size=sc.nextInt();
		System.out.print("Enter the colour of wheels:");
		this.colour=sc.next();
		}
}
