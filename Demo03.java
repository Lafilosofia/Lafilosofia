package day03;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * switch-case�����һ������ķ�֧�ṹ,���Ը���һ���������ʽ�Ĳ�ͬȡֵ
		 * �Ӳ�ͬ�ĳ�����ڿ�ʼִ��
		 * ��JDK7.0��ʼ,switch-case֧���ַ������ʽ
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("���û����1-4����");
		int n=scanner.nextInt();
		switch(n){
			case 1:
				System.out.println("�鿴�˵�");
				break;
			case 2:
				System.out.println("��ֵ�ɷ�");
				break;
			case 3:
				System.out.println("ҵ�����");
				break;
			case 4:
				System.out.println("�˹�����");
				break;
			default:
				System.out.println("û��ҵ����Ҷ�");
		}
	}
}
