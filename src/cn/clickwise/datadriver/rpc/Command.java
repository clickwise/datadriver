package cn.clickwise.datadriver.rpc;

import java.io.Serializable;

/**
 * &nbsp; &nbsp;&nbsp; &nbsp; the abstract of command executed in the remote machine
 * @author lq
 */

@SuppressWarnings("serial")
public abstract class Command implements Serializable{
	
	/**
	 * execute the command ,write output to Response object
	 * @return Response
	 */
	public abstract Response execute();
	
}
