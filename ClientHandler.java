package src.com.ykt.webServer.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.EmptyStackException;

import com.ykt.webServer.http.EmptyRequestException;
import com.ykt.webServer.http.HttpRequest;
import com.ykt.webServer.http.HttpResponse;
import com.ykt.webServer.servlet.LoginServlet;
import com.ykt.webServer.servlet.RegisterServlet;
import com.ykt.webServer.servlet.UpdateServlet;

/**
 * 线程任务类,用于处理某个客户端的请求并予以相应
 * @author 86180
 *
 */
public class ClientHandler implements Runnable {
		private Socket socket;
		public ClientHandler(Socket socket){
			this.socket=socket;
		}
		
		public void run() {
			try {
				//处理客户端请求数据
				src.com.ykt.webServer.http.HttpRequest request=new src.com.ykt.webServer.http.HttpRequest(socket);
//				//获取请求地址
				String uri=request.getRequestURI();
				System.out.println(uri);
				//响应客户端数据
				src.com.ykt.webServer.http.HttpResponse response=new src.com.ykt.webServer.http.HttpResponse(socket);
//				
				File file=new File("webapps"+uri);
				if("/regServlet".equals(uri)){//如果是用户注册则要处理用户数据
					//处理注册数据
					src.com.ykt.webServer.servlet.RegisterServlet reg=new src.com.ykt.webServer.servlet.RegisterServlet();
					reg.service(request, response);
				}else if("/loginServlet".equals(uri)){//如果是用户登录则要处理用户登录数据
					//处理登录数据
					src.com.ykt.webServer.servlet.LoginServlet login=new src.com.ykt.webServer.servlet.LoginServlet();
					login.service(request,response);
					
				}else if("/updateServlet".equals(uri)){	
					src.com.ykt.webServer.servlet.UpdateServlet update=new src.com.ykt.webServer.servlet.UpdateServlet();
					update.service(request,response);
					
				}else{//判断文件是否存在
					if(file.exists()){
						response.setEntity(file);
					}else{
						//也要响应一个"错误页面",
						File f=new File("webapps/error.html");
						response.setStatusCode(404);//响应404错误
						response.setEntity(f);
					}
				}
				response.flush();
			}catch(EmptyStackException e){
				System.out.println("空请求");
			}catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}
}