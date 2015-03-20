package cn.clickwise.datadriver.rpc;

/**
 * Abstract Factory Design Pattern <br>
 * AbstractFactory
 * 
 * @author lq
 */
public abstract class RPCFactory {

	/**
	 * make rpc command
	 * @return Command
	 */
	public abstract Command makeCommand();
	
	/**
	 * make the output of executing rpc command
	 * @return Response
	 */
	public abstract Response makeResponse();
	
}
