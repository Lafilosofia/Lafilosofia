package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Map的遍历:
 * Map有三种遍历方式:
 * 1.遍历所有的key
 * 2.遍历所有的key-value键值对
 * 3.遍历所有的value(相对不常用)		
 * @author 86180
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文",96);
		map.put("数学",100);
		map.put("英语",80);
		map.put("化学",100);
		System.out.println(map);
		
		//可以有序的存入集合
		Map<String,Integer> linked = new LinkedHash<String,Integer>();
		
		Collection<Integer> values = map.values();
		for(Integer v:values){
			System.out.println(v);
		}
		
		//求集合中的科目平均值
		double sum = 0.0;
		for(Integer v:values){
			sum += v;
		}
		System.out.println(sum / map.size());
	}
}
