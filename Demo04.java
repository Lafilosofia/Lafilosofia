package day03;

import java.util.Random;
import java.util.Scanner;

/**
 * ѭ��while(boolean){����}
 * �﷨:booleanֵ����true�����ѭ��,��������ѭ��
 * @author 86180
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * while(true){����}
		 * break:������ǰѭ��
		 */
		/*while(true){//��ѭ��
			System.out.println("�Ǻ�");
			break;
		}*/
		
		/*int age=1;
		while(age<=10){
			System.out.println("����:"+age);
			age++;
		}*/
		
		/*
		 * �����
		 * ��ʽһ:Random���ṩ����Ӧ���������������Ĳ�ͬ����
		 * ��ʽ��:Math.random() ����������double,���Ҫ�ô˷����������
		 * ����,����Ҫǿ������ת��(doubleת��Ϊint)
		 */
		/*Random random=new Random();
		int n=random.nextInt(10);//��0-9�в���һ�������int���͵���
		System.out.println(n);*/
		//double n=Math.random();//��0-1֮���һ�������double���͵���
		/*int n=(int)(Math.random()*10);//��0-9֮�����һ�������int���͵���
		System.out.println(n);*/
		
		/*
		 * �������һ��������,���û�������,�����������ʾ"����",
		 * ���С����ʾ"С��",�����������ʾ"��ϲ�¶���",һ��5�β����ֻ���
		 */
		Scanner scanner=new Scanner(System.in);
		int n=(int)(Math.random()*21);//Math.random()*21�൱��Math.random()*21+0,��0��(21-1)֮������һ�������
		System.out.println(n);//����
		int count=5;
		while(true){
			if(count==0){
				System.out.println("��Ϸ����,��ӭ�´ι���!");
				break;
			}
			System.out.println("�㻹��"+count+"�λ���");
			System.out.println("������������");
			int input=scanner.nextInt();
			if(n<input){
				System.out.println("����");
				count--;
			}else if(n>input){
				System.out.println("С��");
				count--;
			}else{
				System.out.println("��ϲ��¶���");
				break;
			}	
		}
		
	}
}
