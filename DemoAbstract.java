package day03;
/**
 * ��������ʾ��
 * 1.��abstract����
 * 2.ֻ�з����Ķ��壬û�о����ʵ��(��{}Ҳû��)
 * ������ ��
 * 1.��abstract����
 * 2.�������󷽷���������ǳ����࣬���������󷽷�����Ҳ��������λ�����ࣨ��ʵ�ã�
 * 3.�������ǲ��ܱ�ʵ������
 * 4.����������Ҫ���̳еģ������ࣺ������д�������еĳ��󷽷����䲻����Ϊ����
 * ����������壺
 * 1.��װ���������е����Ժ���Ϊ(���븴��)
 * 2.Ϊ�����������ṩͳһ������--��������
 * 3.���԰������󷽷���Ϊ�����������ṩͳһ����ڣ����������Ϊ��һ�����������һ�µ�
 * @author 86180
 *
 */
public abstract class DemoAbstract {
	
	public abstract void test();		//���󷽷�
		
	public abstract void test2();
	
	public static void main(String[] args) {
		//DemoAbstract d = new DemoAbstract();
		DemoAbstract a = new AOO();
		a.test();
		
	}
	
}
	class AOO extends DemoAbstract{
		//������д�����еĳ��󷽷����䲻����Ϊ����
		public void test(){
			DemoAbstract d = new AOO();
			System.out.println("������д�����еĳ��󷽷�");
		}
		
		public void test2(){
			
		}
	}
	
	

