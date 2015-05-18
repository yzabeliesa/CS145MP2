package CS145MP2.src;

import java.io.*;
import java.net.*;

public class MyConnection{

	Socket s;
	PrintWriter out;
	BufferedReader in;

	public MyConnection(Socket s){
		try{
			this.s = s;
			this.out = new PrintWriter(new OutputStreamWriter(this.s.getOutputStream()), true);
			this.in = new BufferedReader(new InputStreamReader(this.s.getInputStream()));
		}catch(Exception e){
			System.out.println("System: An error occurred.");
			e.printStackTrace();
		}
	}

	public boolean sendMessage(String msg){
		try{
			this.out.println(msg);
			return true;
		}catch(Exception e){
			System.out.println("System: An error occurred.");
			e.printStackTrace();
			return false;
		}
	}

	public String getMessage(){
		try{
			return in.readLine();
		}catch(Exception e){
			e.printStackTrace();
			return "System: An error occurred.";
		}
	}

}