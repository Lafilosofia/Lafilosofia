package day03;
/**
 * byte,char,shortת��Ϊint
 * byte,char,short��������ʵ�ʴ洢�����ݶ�����������ʵ��ʹ����
 * ��ѭ���¹���:
 * intֱ��������ֱ�ӽӸ�ֵ��byte,char��short,ֻҪ���������ʾ��Χ
 * byte,char��short�������Ͳ�������ʱ,��һ��ת��Ϊint�����ٽ�������
 * 
 * byte��Χ			-128~127				1���ֽ�
 * short��Χ		-32768~32767			2���ֽ�
 * float��Χ		-3.403E38~3.403E38		4���ֽ�
 * double��Χ		-1.798EE308~1.798EE308	8���ֽ�
 * long��Χ			-9223373036854775808~9223373036854775807	8���ֽ�
 * @author 86180
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		byte a=12;
		byte b=8;
		byte c=(byte)(a+b);
		short a1=12;
		short b1=8;
		short c1=(short)(a1+b1);
		char ch='a';
		char ch2='b';
		short s=(short)(ch+ch2);
		System.out.println(s);
		/*
		 * ����float����ʱ��������ֵ���һ��"f",���д����һ����������"f",ϵͳ����Ϊ��int����
		 * ��:int a=5;
		 * ���д����һ��С������"f"��ϵͳ�����Ϊ��double����;
		 */
		float f=0.35f;
		
	}
}
