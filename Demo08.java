package day03;
/**
 * ͨ���������һ�γ������е�ʱ��
 * @author Lenovo
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		/*
		 * ����ִ��forѭ����Ϻ�һ�������˶��ٺ���
		 * System���ṩ��һ����̬����currentTimeMillis()ָ��ǰ�ĺ�����;
		 */
		long time1=System.currentTimeMillis();//����Ϊlong����
		//System.out.println(time1);
		for(int i=0;i<10000;i++){
			System.out.println(i);
		}
		long time2=System.currentTimeMillis();
		//System.out.println(time2);
		System.out.println("ִ��forѭ����Ϻ�һ��������"+(time2-time1)+"����");
	}
}
