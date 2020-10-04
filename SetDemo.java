package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day09.Point02;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("sev");
		set.add("ss");
		set.add("bb");
		set.add("66");
		set.add("bb");
		//System.out.println(set.size());
		Set<Point02> set2 = new HashSet<Point02>();
		set2.add(new Point02(2,3));
		set2.add(new Point02(2,4));
		set2.add(new Point02(2,5));
		set2.add(new Point02(2,7));
		set2.add(new Point02(2,5));
		//System.out.println(set2.size());
		//System.out.println(set2);
		
		List<Point02> list = new ArrayList<Point02>();
		//List集合可重复,有序
		list.add(new Point02(2,3));
		list.add(new Point02(2,4));
		list.add(new Point02(2,5));
		list.add(new Point02());
		list.add(new Point02());
		System.out.println(list.size());
		System.out.println(list);
	}
}
