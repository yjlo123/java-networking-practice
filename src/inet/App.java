package inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
	public static void main(String[] args){
		try {
			InetAddress Address = InetAddress.getLocalHost();
			Address = InetAddress.getByName("yjlo.xyz");
			System.out.println(Address);
			
			InetAddress SW[] = InetAddress.getAllByName("www.google.com");
			for(int i = 0; i < SW.length; i++){
				System.out.println(SW[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
