package cn.clickwise.datadriver.rpc.implement;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cn.clickwise.datadriver.rpc.Command;
import cn.clickwise.datadriver.rpc.Response;

/**
 * &nbsp; &nbsp;&nbsp; &nbsp; rpc command <br><br>
 * &nbsp; &nbsp;&nbsp; &nbsp; copy a file/directory from remote machine<br><br>
 * &nbsp; &nbsp;&nbsp; &nbsp; it is a plain file/directory or a file/directory in hdfs<br><br> 
 * @author lq
 */
public class RCopyCommand extends Command{
	
	/**
	 * path of file/directory to be copied <br>
	 * eg: <br>
	 *  &nbsp; file:///home/clickwise/lq <br>
	 *  or <br>
	 *  &nbsp; hdfs:///user/hive/clickwise.db/astat  <br>
	 */
	private String path;

	/**
	 * serial version UID
	 */
	private static final long serialVersionUID = 9166212716026416734L;

	@Override
	public Response execute() {

        if(path.startsWith("file:\\/\\/"))
        {
           	
        }
        else if(path.startsWith("hdfs:\\/\\/"))
        {
        	
        }
           
		return null;
	}

	/**
	 * override the read object method of serializing
	 * 
	 * @param s
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void readObject(ObjectInputStream s) throws IOException,ClassNotFoundException{
		s.defaultReadObject();
		
	}
	
	/**
	 * override the write object method of serializing
	 * @param s
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream s) throws IOException{
		s.defaultWriteObject();
		
		
	}

	/**
	 * get path
	 * @return String
	 */
	public String getPath() {
		return path;
	}

	/**
	 * set path
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
}
