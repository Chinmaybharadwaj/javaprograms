import java.io.*;
import java.util.*;
import java.util.Scanner;
@SuppressWarnings("serial")
public class Manager implements Runnable,Serializable {
	Thread t;
	Scanner sc=new Scanner(System.in);
	LinkedList<Car> temp;
	ObjectOutputStream out;
	
	Manager(LinkedList<Car> temp2){
	t=new Thread(this,"Manager");
	this.temp=temp2;
	try{
		FileOutputStream fout=new FileOutputStream("I:\\f.txt");
		 out=new ObjectOutputStream(fout);
		}catch(Exception e) {
			System.out.print(e);
			}
	
	t.start();
	}
	
		public void run() {
			while(true) {
					System.out.println("Enter 1-register new car\n      2-users car details\n      3-end registering");
					int choice=sc.nextInt();
					if(choice==1) {
						Car car=new Car();
						car.get_details();
						temp.add(car);
						try {
						out.writeObject(car);
						}catch(IOException e) {
							
						}
				
					if(choice==3) {
						break;
					}
					if(choice==2) {
						for(int i=0;i<temp.size();i++) {
							Car car2;
							car2=temp.get(i);
							System.out.println("Ownername: WheelSize:");
							System.out.println(car2.ownerName+": "+car2.w.size+" ");
							
						}
					}
					
				}
			}
		}
}


