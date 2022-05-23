package Server;

//A Java program for a Server
import java.net.*;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.io.*;

public class Server
{
	//initialize socket and input stream
	private Socket		 socket = null;
	private ServerSocket server = null;
	private DataInputStream in	 = null;

	// constructor with port
	public Server(int port)
	{
		// starts server and waits for a connection
		try
		{
			server = new ServerSocket(port);

			socket = server.accept();
			System.out.println("Client accepted");

			// takes input from the client socket
			in = new DataInputStream(
				new BufferedInputStream(socket.getInputStream()));

			String line = "";

			
			try
			{
				line = in.readUTF();
				try {
					InputMismatchException x = new InputMismatchException();
					if (line.length() >= 80) {
						throw x;
					}
					
					else {
						String nstr="";
				        
				        for (int i=0; i<line.length(); i++)
				        {
				          char ch= line.charAt(i); //extracts each character
				          
				          if (Character.isLowerCase(ch)) {
				        	  char chUp = Character.toUpperCase(ch);
				        	  nstr = chUp+nstr;
				          }
				          		
				          else if (Character.isUpperCase(ch)) {
				        	  char chLow = Character.toLowerCase(ch);
				        	  nstr = chLow+nstr;
				          }
				          			
				          else {
				        	  nstr= ch+nstr;
				          }
				        }
				        System.out.println(nstr);
					}
				}
				catch (InputMismatchException m) {
					System.out.println("Input Too long");
				}
			}
			catch(IOException i)
			{
				System.out.println(i);
			}

			// close connection
			socket.close();
			in.close();
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}

	public static void main(String args[])
	{
		try {
			int port = Integer.parseInt(args[0]);
			Server server = new Server(port);
		}
		catch (NumberFormatException er) {
			System.out.println("Input for port is incorrect");
		}
		
		
	}
}

