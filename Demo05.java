package day03;
/**
 * do{����}while(boolean)
 * ��ִ�������ٽ����ж�
 * boolean���Ϊtrue�����ִ������ֱ��booleanΪfalse������ѭ��
 * 
 * ע��:
 * ����while()ѭ������������:while()ѭ�������ж���ִ��,
 * ��do{}while()����ִ�����ж�
 * @author 86180
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		/*int a=0;
		do{
			System.out.println(a);
			a++;
		}while(a<6);*/
		/*
		 * for(���ʽ1;���ʽ2;���ʽ3){����}�̶�ѭ��:
		 * forѭ��ִ��˳��:
		 * ��ִ�б��ʽ1��ִ�б��ʽ2(true)Ȼ����ִ������
		 * ��ִ�б��ʽ3Ȼ����ִ�б��ʽ2��ִ��������ִ�б��ʽ3...
		 * ֱ�����ʽ2λfalse������ѭ��
		 */
		//��ʽһ:
		for(int i=0;i<10;i++){
			if(i==6){
				//continue������ǰ�жϲ�����ִ�в�����ѭ������ִ��ѭ��
				continue;
			}
			System.out.println(i);
		}
		
		//��ʽ��:
		/*int i=0;
		for(;i<10;i++){
			System.out.println(i);
		}*/
		
		//��ʽ��:
		/*for(int i=0;i<10;){
			System.out.println(i);
			i++;
		}*/
		
		//��ʽ��:(�˽�)
		/*for(;;){//��ѭ��
			System.out.println("�Ǻ�");
		}*/
		
		
		
		
	}
}