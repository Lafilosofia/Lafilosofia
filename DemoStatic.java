package day03;
/**
 * ��̬������
 * ��static����
 * @author 86180
 *
 */
public class DemoStatic {
	int a = 1;			//��Ա����	
	static int b = 1;	//��̬����	
	public DemoStatic(){
		a ++;
		b ++;
	}
	
	public void show(){
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	
	public static void main(String[] args) {
		DemoStatic demo = new DemoStatic();
		demo.show();
		
		DemoStatic demo2 = new DemoStatic();
		demo2.show();
		
		DemoStatic demo3 = new DemoStatic();
		demo3.show();
		
		DemoStatic demo4 = new DemoStatic();
		demo4.show();
	}
}
