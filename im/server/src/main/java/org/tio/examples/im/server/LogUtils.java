package org.tio.examples.im.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 2017年5月29日 下午10:46:53
 */
public class LogUtils {
	private static Logger log = LoggerFactory.getLogger(LogUtils.class);

	public static Logger getIpBlacklistLog() {
		return LoggerFactory.getLogger("tio-ipblacklistxxxx-trace-log");
	}

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

	}

	//

	/**
	 *
	 * 
	 */
	public LogUtils() {
	}
}
