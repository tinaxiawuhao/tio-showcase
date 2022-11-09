package org.tio.examples.showcase.server;

import java.io.IOException;

import org.tio.examples.showcase.common.Const;
import org.tio.server.TioServer;
import org.tio.server.ServerGroupContext;
import org.tio.server.intf.ServerAioHandler;
import org.tio.server.intf.ServerAioListener;

public class ShowcaseServerStarter {
	static ServerAioHandler aioHandler = new ShowcaseServerAioHandler();
	static ServerAioListener aioListener = new ShowcaseServerAioListener();
	static ServerGroupContext serverGroupContext = new ServerGroupContext(aioHandler, aioListener);
	static TioServer tioServer = new TioServer(serverGroupContext); //可以为空

	static String serverIp = null;
	static int serverPort = Const.PORT;

	public static void main(String[] args) throws IOException {
		tioServer.start(serverIp, serverPort);
	}
}