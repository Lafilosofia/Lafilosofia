package day10;

import java.util.HashMap;
import java.util.Map;

/**
 * 给map集合添加元素
 * @author 86180
 * Map称为查找表，该数据结构体现了样子是一个"多行两列"的表格，
 * 左列称为key，右列称为value。
 * Map总是根据key查找对应的value
 * 存储元素也要求以key-value成对存入
 * 
 * 常用的实现类:java.util.HashMap散列表，哈希表HashMap时基于散列算法实现的Map
 * 当今世界最快的查询结构
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/*
		 * V put(Key key,Value v)
		 * 将给定的key-value键值对存入到Mao中，Map有一个要求
		 * key不允许重复(key的equals比较决定)；若使用Mao已有的key存入value，
		 * 则是替换value
		 */
	}
}
