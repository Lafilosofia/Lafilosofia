package day03;

import java.util.Scanner;

/**
 * ��֧�ṹ
 * if(boolean){����}
 * boolean���Ϊtrue��ִ��if����,�෴��ִ��
 * @author 86180
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		/*int a=5;
		int b=8;*/
		/*if(a>b){
			System.out.println("���");	
		}
		if(a<b){
			System.out.println("�Ե�");
		}*/
		
		/*
		 *if(boolean){����1}else{����2} 
		 *boolean����Ϊtrueʱִ������1,����ִ������2
		 */
		
		/*if(a>b){
			System.out.println("����1");
		}else{
			System.out.println("����2");
		}*/
		
		/*
		 * if(){}else if(){}else if(){}...else{}
		 */
		
		/*if(a>b){
			System.out.println("����1");
		}else if(a==b){
			System.out.println("����2");
		}else if(a<b){
			System.out.println("����3");
		}else{
			System.out.println("����4");
		}*/
		
		/*
		 * ģ�ⳬ����Ʒ����ϵͳ
		 * ����500(����500)���ϵ�1000(����1000)��9��
		 * 1000���ϵ�2000(����2000)��8.5��
		 * 2000���ϴ�7.5��
		 */
		
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("��������Ʒ�ļ۸�:");
		double price=scanner.nextDouble();
		if(price<=0){
			System.out.println("��Ϸ�������Ʒ�۸�");
		}
		System.out.println("��������Ʒ����:");
		int count=scanner.nextInt();
		if(count<=0){
			System.out.println("��Ϸ�������Ʒ������");
		}
		//�����ܼ�
		double allPrice=price*count;
		//�ж��ۿ�
		if(allPrice<500&&allPrice>0){
			System.out.println("������,��Ҫ֧��:"+allPrice);
		}else if(allPrice>=500&&allPrice<=1000){
			System.out.println("��9��,��Ҫ֧��:"+(allPrice*0.9));
		}else if(allPrice>1000&&allPrice<=2000){
			System.out.println("��8.5��,��Ҫ֧��:"+(allPrice*0.85));
		}else if(allPrice>2000){
			System.out.println("��7.5��,��Ҫ֧��:"+(allPrice*0.75));
		}else{
			System.out.println("��������");
		}*/
		
		/*
		 * �κ���ҵ:
		 * ����ѧԱ�ĳɼ�����ȼ�
		 * A:�ɼ����ڵ���90��С�ڵ���100��,���"����";
		 * B:�ɼ�С��90�ִ��ڵ���80��,���"����";
		 * C:�ɼ�С��80�ִ��ڵ���60��,���"����";
		 * D:�ɼ�С��60��;���"������";
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ѧԱ�ĳɼ�:");
		double score;
		while(true){
			score=scanner.nextDouble();
			if(score<0 || score>100){
				System.out.println("��Ϸ�����ɼ���");
			}else{
				break;
			}
		}
		if(score>=90&&score<=100){
			System.out.println("��ĳɼ������㣡");
		}else if(score>=80&&score<90){
			System.out.println("��ĳɼ������ã�");
		}else if(score>=60&&score<80){
			System.out.println("��ĳɼ��Ǽ���");
		}else{
			System.out.println("��ĳɼ����ϸ�");
		}
		
		
	}
}
