/**
 * Package: shenjiaqi.api
 * @auth Shen Jiaqi
 * @version 2014-10-22
 */
package shenjiaqi.api.timer;

import java.util.Objects;

import shenjiaqi.api.interfaces.Time;
import java.lang.Long;

/**
 * 
 * @author Shen Jiaqi
 * @version 2014-12-07
 */
public class Timer implements Time {

	private long hour;
	private long minute;
	private long second;
	private long millisecond;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public boolean equals() {
		return true;
	}
		
	public int hashCode() {
		return Objects.hash(hour, minute, second, millisecond);
	}
	
	public String toString() {
		return Class.class.getName() + "";
	}
	
}
