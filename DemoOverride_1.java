package day03;

public class DemoOverride_1 extends DemoOverride {
	//��д�����еķ���
	public void test(){
		System.out.println("�����test()����");
	}
	
	//����ĵ�������
	public void test1(){
		System.out.println("123");
	}
	
	public int test2(){
		System.out.println("�����test2����");
		return 1;
	}
	
	public DemoOverride_1 test3(){
		System.out.println("�����test3()����");
		return new DemoOverride_1();
	}
	
	protected void test4(){
		System.out.println("�����test4()����");
	}
	
	public static void main(String[] args) {
		DemoOverride_1 d1 = new DemoOverride_1();
		
		//��������
		DemoOverride d = new DemoOverride_1();
		d.test();
	}
}
