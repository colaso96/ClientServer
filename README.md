# ClientServer

## Overview:
This is a simple program that initializes and client and a server for communication over TCP using a shared port & a unique IP address.

## Features:
Client: The client takes in an IP address and port number as its arguments and checks that are of the correct data types before initialization.

Server: The server takes in a port number and also checks that it is an integer type before printing to the screen that the client has been accepted if the IP and ports match.

## How To Run:
The server must be started first and then client from a different tab in the terminal window.  After connection is established and the two can communciate you can type any message into the client.  The server will then check if the message is less than 80 characters which is a requiremnt of this project.  If the message is less than 80 characters the server will reverse the message order and switch upper case to lower case and vice versa.  

If any error is recieved then they are handled in the catch blocks and outputted to the screen for the user.  Examples of errors are Number Format Exceptions when the inputs are correct, Input Mismatch Excpetion if the message is more than 80 characters, IO Exception if the ports do not match and others to ensure a stable connection.

After one message is sent the server is then closed and the operation is ended for both the client and the server.


## Description of Examples:
Client <127.00.1 5000>

Server <5000> 

Server: Client accepted
Client: Connected

Client: message: Hello World
Server: DLROw OLLEh

Client message:  This message is waaaaaaaaaaaaaaaaayyyyyyyyyyy tooooooooo looooooooooonnnnnnnnggggg
Server: Input too long

Both of the examples above will then end execution
