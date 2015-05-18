package CS145MP2.src;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

public class MyServer{

	LinkedList<SocketThread> clients;
	ServerSocket ssocket;

	public MyServer(){
		
		this.clients = new LinkedList<SocketThread>();

		try{
			System.out.println("Server: Starting server. . .");
			this.ssocket = new ServerSocket(8888);
			System.out.println("Server: Waiting for connections. . .");

			while(true){
				SocketThread sg = new SocketThread();
				this.clients.add(sg);
				sg.start();
			}
		
		}catch(Exception e){
			System.out.println("Server: An error occurred.");
			e.printStackTrace();
		}		
	}
	
	public static void main(String args[]){
		new MyServer();
	}

	private class SocketThread extends Thread{
		
		Socket s;
		MyConnection conn;
		boolean flag;

		public SocketThread(){
			try{
				this.s = ssocket.accept();
				this.conn = new MyConnection(this.s);
				this.flag = false;
				this.conn.sendMessage("Server: " + "you have been connected.");
			}catch(Exception e){
				System.out.println("Server: An error occurred.");
				e.printStackTrace();
			}
		}
		
		public void run(){
			try{
				while(true){
				
				}
			}catch(Exception e){
				System.out.println("Server: An error occurred.");
				e.printStackTrace();
			}		
		}
	}
}