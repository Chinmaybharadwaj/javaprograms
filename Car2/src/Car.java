import java.util.Scanner;
import java.io.Serializable;


@SuppressWarnings("serial")
public class Car implements Serializable{

	//This is class car which has the data about the parts of a car
	 wheel w=new wheel();
	 hoods h=new hoods();
	 doors d=new doors();
	 String ownerName;
	 Scanner sc=new Scanner(System.in);
	synchronized void get_details() {
		System.out.print("Enter the clients name");
		ownerName=sc.next();
		 w.getVal();	 
		 h.getVal();
		 d.getVal();
		
	 }
}
