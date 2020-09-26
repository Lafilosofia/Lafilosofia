package day03;

public class DemoOverride_1 extends DemoOverride {
	//重写父类中的方法
	public void test(){
		System.out.println("子类的test()方法");
	}
	
	//子类的单独方法
	public void test1(){
		System.out.println("123");
	}
	
	public int test2(){
		System.out.println("子类的test2方法");
		return 1;
	}
	
	public DemoOverride_1 test3(){
		System.out.println("子类的test3()方法");
		return new DemoOverride_1();
	}
	
	protected void test4(){
		System.out.println("子类的test4()方法");
	}
	
	public static void main(String[] args) {
		DemoOverride_1 d1 = new DemoOverride_1();
		
		//向上造型
		DemoOverride d = new DemoOverride_1();
		d.test();
	}
}
