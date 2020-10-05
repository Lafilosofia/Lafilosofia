package src.com.ykt.webServer.servlet;

import java.io.RandomAccessFile;
import java.util.Arrays;

import com.ykt.webServer.http.HttpRequest;
import com.ykt.webServer.http.HttpResponse;

/**
 * 修改用户密码
 * @author 86180
 *
 */
public class UpdateServlet {
	/*
	 * 修改用户密码流程
	 * 1.获取用户修改密码的数据
	 * 2.首先用户的账号密码是正确的，否则提示响应的错误页面
	 * 4.修改完猴响应一个修改成功页面
	 */
	public void service(HttpRequest request, HttpResponse response){
		//1.获取用户修改密码的数据
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String newPwd = request.getParameter("newPassword");
		String confirmPwd = request.getParameter("confirmPassword");
		try(RandomAccessFile raf = new RandomAccessFile("user.dat","rw")){
			boolean flagName = false;
			boolean flagPwd = false;
			for(int i = 0;i < raf.length() / 100;i ++){
				//设置指针位置
				raf.seek(i * 100);
				//从user.dat文件中提取数据
				byte[] bytes = new byte[32];
				//获取用户名字
				raf.read(bytes);
				String userName = new String(bytes,"UTF-8");
				if(userName.equals(name)){	//判断用户账号是否存在
					flagName = true;
					//读取密码
					raf.read(bytes);
					String userPwd = new String(bytes,"UTF-8");
					if(userPwd.equals(pwd)){	//判断用户密码是否正确
						//账号密码都正确
						flagPwd = true;
						//为了修改密码重新设置指针位置
						raf.seek(i * 100 + 32);
						bytes = Arrays.copyOf(bytes, 32);
						//修改密码
						bytes = newPwd.getBytes("UTF-8");
						raf.write(bytes);
					}
				}
			}
			
		}catch(Exception e){
			
		}
	}
}
