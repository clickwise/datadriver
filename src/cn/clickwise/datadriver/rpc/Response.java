package cn.clickwise.datadriver.rpc;

import java.io.Serializable;

/**
 * &nbsp; &nbsp;&nbsp; &nbsp; the output of executing a command in remote machine
 * @author lq
 */

@SuppressWarnings("serial")
public abstract class Response implements Serializable{

	/**
	 * explain the Response object in the local machine
	 * write result values to stdout
	 * write result files to local filesystem
	 */
	public abstract void flush();
	
}
