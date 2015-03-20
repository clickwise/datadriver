package cn.clickwise.datadriver.rpc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * &nbsp; &nbsp;&nbsp; &nbsp; register new rpc factory implementation <br>
 * &nbsp; &nbsp;&nbsp; &nbsp; get registered rpc factory implementation by name
 * 
 * @author lq
 */
public class RPCServices {

	/**
	 * prevents instantiation
	 */
	private RPCServices(){}
	
	private static final Map<String,RPCFactory> rpcfactorys=new ConcurrentHashMap<String,RPCFactory>();
	
	public static final String DEFAULT_RPCFACTORY_NAME="<def>";
	
	/**
	 * register the default rpc factory implementation
	 * @param rpcf
	 */
	public static void registerDefaultRPCFactory(RPCFactory rpcf){
		registerRPCFactory(DEFAULT_RPCFACTORY_NAME,rpcf);
	}
	
	/**
	 * register rpc factory implementation by name
	 * @param name
	 * @param rpcf
	 */
	public static void registerRPCFactory(String name,RPCFactory rpcf){		
		rpcfactorys.put(name, rpcf);
	}
	
	
}
