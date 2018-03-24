package src.com.jspider.oece12.Collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class iterateMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("chand", new Integer(10));
		map.put("ashad", new Integer(20));
		map.put("mohd", new Integer(30));
		map.put("jsp", new Integer(40));
		map.put("abc", new Integer(50));
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		
		System.out.println("-using labda exression");
		map.forEach((k,v)->System.out.println(k+": "+v));
	}

}
