package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Map�ı���:
 * Map�����ֱ�����ʽ:
 * 1.�������е�key
 * 2.�������е�key-value��ֵ��
 * 3.�������е�value(��Բ�����)		
 * @author 86180
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����",96);
		map.put("��ѧ",100);
		map.put("Ӣ��",80);
		map.put("��ѧ",100);
		System.out.println(map);
		
		//��������Ĵ��뼯��
		Map<String,Integer> linked = new LinkedHash<String,Integer>();
		
		Collection<Integer> values = map.values();
		for(Integer v:values){
			System.out.println(v);
		}
		
		//�󼯺��еĿ�Ŀƽ��ֵ
		double sum = 0.0;
		for(Integer v:values){
			sum += v;
		}
		System.out.println(sum / map.size());
	}
}
