import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------MAIN THREAD-----------------------------");
		Sleep s=new Sleep();
				s.sleep_d(1000);
		System.out.println("------------------------Manager Initializing-----------------------------");
		s.sleep_d(1000);
		FileOutputStream fout=null;
		 ObjectOutputStream out=null;
		LinkedList<Car> database=new LinkedList<Car>();
		/*try{
		FileOutputStream fout=new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		}catch(Exception e) {
			System.out.print(e);
			}
		*/
		//creating a manager thread that handles clients request
		Manager M=new Manager(database);
		try {
		M.t.join();
		}catch(InterruptedException e) {
			}
		s.sleep_d(1000);	
		System.out.println("------------------------Saving  Status-----------------------------");
		/*for(int i=0;i<database.size();i++) {
			car=database.get(i);
			
			
		}*/
		try{
			 fout=new FileOutputStream("I:\\f.txt");
			 out = new ObjectOutputStream(fout);
			}catch(Exception e) {
				System.out.print(e);
				}
		try {
			out.writeObject(M);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("------------------------Manager Ending-----------------------------");
		
		

	}

}
