package day03;
/**
 * 重点：
 * 方法的重写（override）：重新写，覆盖
 * 1.发生在父子类中，方法名称相同，参数列表相同，但是方法体不同
 * 2.重写方法被调用时，看对象的类型，能点出来看引用类型
 * 3.重写要遵循“两同两小一大”原则：(1)两同：方法名相同；参数列表相同
 * 									 (2)两小：void时，必须相等；
 * 										基本类型时，必须相等；
 * 										引用类型时,小于或等超类（返回类型必须小于或等于超类的类型）
 * 										派生类所抛出的异常小于或等于超类的异常
 * 									 (3)一大：派生类的方法的访问权限大于或等于超类的权限
 * 											  
 * @author 86180
 *
 */
public class DemoOverride {
	public void test(){
		System.out.println("父类中的test()方法");
	}
	
	public DemoOverride_1 test3(){
		System.out.println("父类中的test3()方法");
		return new DemoOverride_1();
		
	}
	
	public void test4(){
		System.out.println();
	}
}
