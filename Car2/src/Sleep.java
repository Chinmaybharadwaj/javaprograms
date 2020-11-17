import java.io.Serializable;
@SuppressWarnings("serial")
public class Sleep implements Serializable {
	void sleep_d(int x){
		try {
			Thread.sleep(x);
			}catch(Exception e) {
				System.out.println(e);
			}
	}
}
