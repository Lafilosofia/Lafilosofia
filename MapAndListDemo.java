package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapAndListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("admin");
		list.add("password");
		list.add("address");
		
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(300);
		list2.add(500);
		list2.add(800);
		
		List<Double> list3 = new ArrayList<Double>();
		list3.add(1000.89);
		list3.add(1400.00);
		list3.add(1999.66);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("username", list);
		map.put("list2", list2);
		map.put("list3", list3);
		
		//��ȡ�û���Ϣ
		Object obj = map.get("username");
		System.out.println(obj);
		
		//��дmap�����е�list��������Ԫ��
		Set<Entry<String,Object>> entry = map.entrySet();
		for(Entry<String,Object> e:entry){
			String key = e.getKey();
			List<Object> li = (List<Object>)e.getValue();
			for(Object o:li){
				System.out.println(o);
			}
					
		}
	}
}
