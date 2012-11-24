package edu.ncsu.csc574.emailserver.workflowmanager;

import java.util.HashMap;


/**
 * This function process command and returns IResponse
 * @author Harsha
 *
 */
public interface ICommandProcessor {
	public IResponse process(IRequest request);
}

