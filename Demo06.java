package day03;

import java.util.Random;

import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * ��1+2+3...+10֮��
		 */
/*		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("1+2+3...+10֮��:"+sum);*/
		
		/*
		 * for��Ƕ��ѭ��
		 */
		/*for(int i=0;i<5;i++){
			for(int j=1;j<6;j++){
				if((i+j)==4){
					break;//����(i+j)==4�� break��ֱ��������ǰѭ��
				}
				System.out.println(i+"+"+j+"="+(i+j));
			}	
		}*/
		
		/*
		 * ������ҵ:
		 * �������10�ӷ���,���û���,����100��,������һ��
		 * �۵�10��;
		 * ����1:
		 * 1.�������100����100��Χ�ڵ��������
		 * 2.��Ϸ����������ֶܷ���
		 * ����:(1): 3+6="?".��������10��
		 */
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int grade=100;
		for(int i=1;i<=10;i++){
			int a=random.nextInt(101);
			int b=random.nextInt(101);
			int answer=a+b;
			System.out.println("("+i+"):"+a+"+"+b+"=?");
			int input=scanner.nextInt();//�û�����Ĵ�
			if(answer==input){
				System.out.println("��ϲ��,����ȷ!");			
			}else{
				System.out.println("�ش����,��ȷ����:"+answer);
				grade-=10;
			}	
		}
			System.out.println("����ܷ���:"+grade+"��");
			
		
		
	}
}
