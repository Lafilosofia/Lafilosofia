package day03;

import java.util.Scanner;

/**
 * ��д������ֵ���������
 * @author 86180
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ������");
		int a=scanner.nextInt();
		System.out.println("���ٴ�����һ������");
		int b=scanner.nextInt();
		System.out.println("�������һ������");
		int c=scanner.nextInt();
		
		//��ֵ������
		int m=0;
		if(a>b){//a��b�Ƚ�
			m=a;
			a=b;
			b=m;
		}
		if(b>c){//b��c�Ƚ�
			m=b;
			b=c;
			c=m;
		}
		if(a>c){//a��c�Ƚ�
			m=a;
			a=c;
			c=m;
		}
		System.out.println("�������еĽ��Ϊ:"+a+","+b+","+c);
		
		
	}
}
