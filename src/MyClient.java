package CS145MP2.src;

import CS145MP1BillonesCiprian.src.custom_swing.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class MyClient{

	Socket s;
	MyConnection conn;

	public MyClient(){
		
		try{
			this.flag = false;
			this.s = new Socket("127.0.0.1", 8888);
			this.conn = new MyConnection(s);
		}catch(Exception e){
			System.out.println("Client: An error occurred.");
			e.printStackTrace();
		}	
	}

	public static void main(String args[]){
		MyClient c = new MyClient();
	}
}