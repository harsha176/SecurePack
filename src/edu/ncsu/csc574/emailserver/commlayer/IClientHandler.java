package edu.ncsu.csc574.emailserver.commlayer;

import java.net.Socket;

public interface IClientHandler {
	
	public void handle(Socket socket);
}
