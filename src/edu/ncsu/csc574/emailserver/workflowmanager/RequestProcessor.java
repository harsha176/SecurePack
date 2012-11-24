package edu.ncsu.csc574.emailserver.workflowmanager;

import edu.ncsu.csc574.emailserver.commlayer.IUserContext;



/**
 * This interface validates and processes request
 * @author Harsha
 *
 */
public interface RequestProcessor {
	
	/**
	 * This method validates request and forwards them to appropriate module. 
	 * @param request
	 * @return
	 */
	public IResponse process(IUserContext ctx, IRequest request) throws InvalidRequestException;
	
	
	/**
	 * This method registers commands 
	 * @param name
	 * @param cmd
	 */
	public void register_command(Command name, ICommandProcessor cmd);
}
