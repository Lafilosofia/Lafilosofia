package day03;
/*
 * д���žų˷���
 */
public class Demo07 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){  //������
			for(int j=1;j<=i;j++){  //������
				//  "\t"�൱���Ʊ��(tab)����˼,print��ʾ������
				System.out.print(j+"*"+i+"="+(j*i)+"\t");			
			}
			System.out.println();//����
		}
		/*
		 * ��i=1;(��һ��)
		 * j=1 1*1=1
		 * ��i=2;(�ڶ���)
		 * j=1 1*2=2  j=2 2*2=4
		 * ��i=3;(������)
		 * j=1 1*3=3  j=2 2*3=6  j=3 3*3=9
		 * ....
		 */
		
		
	}
}
