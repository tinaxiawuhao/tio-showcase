package org.tio.examples.im.common.http;

/**
 *
 * 
 *
 */
public interface HttpConst {
	/**
	 * 请求体的格式
	 * 
	 * 2017年6月28日 上午10:03:12
	 */
	public enum RequestBodyFormat {
		URLENCODED, MULTIPART, TEXT

	}

	//	Content-Type: text/html;charset:utf-8;

	/**
	 *         Accept-Language : zh-CN,zh;q=0.8
	     Sec-WebSocket-Version : 13
	  Sec-WebSocket-Extensions : permessage-deflate; client_max_window_bits
	                   Upgrade : websocket
	                      Host : t-io.org:9329
	           Accept-Encoding : gzip, deflate, sdch
	                User-Agent : Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36
	                    Origin : http://www.t-io.org:9292
	         Sec-WebSocket-Key : kmCL2C7q9vtNSMyHpft7lw==
	                Connection : Upgrade
	             Cache-Control : no-cache
	                    Pragma : no-cache
	 *
	 * 
	 * 2017年5月27日 下午2:11:57
	 */
	public interface RequestHeaderKey {
		String Cookie = "Cookie";//Cookie: $Version=1; Skin=new;
		String Origin = "Origin"; //http://127.0.0.1
		String Sec_WebSocket_Key = "Sec-WebSocket-Key"; //2GFwqJ1Z37glm62YKKLUeA==
		String Cache_Control = "Cache-Control"; //no-cache
		String Connection = "Connection"; //Upgrade
		String User_Agent = "User-Agent"; //Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3088.3 Safari/537.36
		String Sec_WebSocket_Version = "Sec-WebSocket-Version"; //13
		String Host = "Host"; //127.0.0.1:9329
		String Pragma = "Pragma"; //no-cache
		String Accept_Encoding = "Accept-Encoding"; //gzip, deflate, br
		String Accept_Language = "Accept-Language"; //zh-CN,zh;q=0.8,en;q=0.6
		String Upgrade = "Upgrade"; //websocket
		String Sec_WebSocket_Extensions = "Sec-WebSocket-Extensions"; //permessage-deflate; client_max_window_bits
		String Content_Length = "Content-Length"; //65
		String Content_Type = "Content-Type";// : 【application/x-www-form-urlencoded】【application/x-www-form-urlencoded; charset=UTF-8】
	}

	/**
	 *
	 * 
	 * 2017年6月27日 下午8:23:58
	 */
	public interface RequestHeaderValue {
		//application/x-www-form-urlencoded、multipart/form-data、text/plain
		public interface Content_Type {
			/**
			 * 普通文本，一般会是json或是xml
			 */
			String text_plain = "text/plain";
			/**
			 * 文件上传
			 */
			String multipart_form_data = "multipart/form-data";
			/**
			 * 普通的key-value
			 */
			String application_x_www_form_urlencoded = "application/x-www-form-urlencoded";
		}
	}

	public interface ResponseHeaderKey {
		//Set-Cookie: UserID=JohnDoe; Max-Age=3600; Version=1
		String Set_Cookie = "Set-Cookie"; //Set-Cookie: UserID=JohnDoe; Max-Age=3600; Version=1
		String Content_Length = "Content-Length"; //65
		/**
		 * 文档的编码（Encode）方法。只有在解码之后才可以得到Content-Type头指定的内容类型。
		 * 利用gzip压缩文档能够显著地减少HTML文档的下载时间。
		 * Java的GZIPOutputStream可以很方便地进行gzip压缩，但只有Unix上的Netscape和Windows上的IE 4、IE 5才支持它。
		 * 因此，Servlet应该通过查看Accept-Encoding头（即request.getHeader("Accept-Encoding")）检查浏览器是否支持gzip，
		 * 为支持gzip的浏览器返回经gzip压缩的HTML页面，为其他浏览器返回普通页面。
		 */
		String Content_Encoding = "Content-Encoding";
		/**
		 * 表示后面的文档属于什么MIME类型。Servlet默认为text/plain，但通常需要显式地指定为text/html。
		 * 由于经常要设置Content-Type，因此HttpServletResponse提供了一个专用的方法setContentType。
		 */
		String Content_Type = "Content-Type";
		/**
		 * 当前的GMT时间。你可以用setDateHeader来设置这个头以避免转换时间格式的麻烦。
		 */
		String Date = "Date";
		/**
		 * 应该在什么时候认为文档已经过期，从而不再缓存它？
		 */
		String Expires = "Expires";
		/**
		 * 文档的最后改动时间。客户可以通过If-Modified-Since请求头提供一个日期，该请求将被视为一个条件GET，
		 * 只有改动时间迟于指定时间的文档才会返回，否则返回一个304（Not Modified）状态。Last-Modified也可用setDateHeader方法来设置。
		 */
		String Last_Modified = "Last-Modified";
		/**
		 * 表示客户应当到哪里去提取文档。Location通常不是直接设置的，而是通过HttpServletResponse的sendRedirect方法，该方法同时设置状态代码为302。
		 */
		String Location = "Location";
		/**
		 * 表示浏览器应该在多少时间之后刷新文档，以秒计。除了刷新当前文档之外，你还可以通过setHeader("Refresh", "5; URL=http://host/path")让浏览器读取指定的页面。
		注意这种功能通常是通过设置HTML页面HEAD区的＜META HTTP-EQUIV="Refresh" CONTENT="5;URL=http://host/path"＞实现，这是因为，自动刷新或重定向对于那些不能使用CGI或Servlet的HTML编写者十分重要。但是，对于Servlet来说，直接设置Refresh头更加方便。

		注意Refresh的意义是"N秒之后刷新本页面或访问指定页面"，而不是"每隔N秒刷新本页面或访问指定页面"。因此，连续刷新要求每次都发送一个Refresh头，而发送204状态代码则可以阻止浏览器继续刷新，不管是使用Refresh头还是＜META HTTP-EQUIV="Refresh" ...＞。

		注意Refresh头不属于HTTP 1.1正式规范的一部分，而是一个扩展，但Netscape和IE都支持它。
		 */
		String Refresh = "Refresh";
		/**
		 * 服务器名字。Servlet一般不设置这个值，而是由Web服务器自己设置。
		 */
		String Server = "Server";
	}

	/**
	 *
	 * 
	 * 2017年6月27日 下午8:24:02
	 */
	public interface ResponseHeaderValue {
	}

	/**
	 * 默认规定连接到本服务器的客户端统一用utf-8
	 */
	String CHARSET_NAME = "utf-8";
}
