package edu.ncsu.csc574.emailserver.commlayer;

import edu.ncsu.csc574.emailserver.exceptions.InitalizationException;

/**
 * This interface starts/initializes email service
 * @author Harsha
 *
 */
public interface ICommunicationService {
	/**
	 * This method runs email server as a daemon and each module gets initialized.
	 * @param port      	email server listening port
	 * @param passphrase	master key to open key store
	 * @return 
	 */
	public int startService(int port, String passphrase) throws InitalizationException;
	
	/**
	 * This method checks if the service is running.
	 * @return
	 */
	public boolean isRunning();
	
	/**
	 * This methods stops email service
	 * @return
	 * @throws Exception
	 */
	public boolean stopService() throws Exception;
}
