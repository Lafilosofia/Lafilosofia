package src.com.ykt.webServer.servlet;

import java.io.RandomAccessFile;
import java.util.Arrays;

import com.ykt.webServer.http.HttpRequest;
import com.ykt.webServer.http.HttpResponse;

/**
 * �޸��û�����
 * @author 86180
 *
 */
public class UpdateServlet {
	/*
	 * �޸��û���������
	 * 1.��ȡ�û��޸����������
	 * 2.�����û����˺���������ȷ�ģ�������ʾ��Ӧ�Ĵ���ҳ��
	 * 4.�޸������Ӧһ���޸ĳɹ�ҳ��
	 */
	public void service(HttpRequest request, HttpResponse response){
		//1.��ȡ�û��޸����������
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String newPwd = request.getParameter("newPassword");
		String confirmPwd = request.getParameter("confirmPassword");
		try(RandomAccessFile raf = new RandomAccessFile("user.dat","rw")){
			boolean flagName = false;
			boolean flagPwd = false;
			for(int i = 0;i < raf.length() / 100;i ++){
				//����ָ��λ��
				raf.seek(i * 100);
				//��user.dat�ļ�����ȡ����
				byte[] bytes = new byte[32];
				//��ȡ�û�����
				raf.read(bytes);
				String userName = new String(bytes,"UTF-8");
				if(userName.equals(name)){	//�ж��û��˺��Ƿ����
					flagName = true;
					//��ȡ����
					raf.read(bytes);
					String userPwd = new String(bytes,"UTF-8");
					if(userPwd.equals(pwd)){	//�ж��û������Ƿ���ȷ
						//�˺����붼��ȷ
						flagPwd = true;
						//Ϊ���޸�������������ָ��λ��
						raf.seek(i * 100 + 32);
						bytes = Arrays.copyOf(bytes, 32);
						//�޸�����
						bytes = newPwd.getBytes("UTF-8");
						raf.write(bytes);
					}
				}
			}
			
		}catch(Exception e){
			
		}
	}
}
