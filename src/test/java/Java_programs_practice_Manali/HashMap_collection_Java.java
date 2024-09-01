package Java_programs_practice_Manali;

import java.util.HashMap;
import java.util.Map;

public class HashMap_collection_Java {

	public static void main(String[] args) {
		// Hashmap class implements Map interface 
		// is dont have insertion orders like set 
		// doesnot allowed to store duplicate values
		// it can store multiple null values for a single null key
		
		Map map = new HashMap();
		map.put("Id", 101);
		map.put("username", "Ajay8327");
		map.put("URl", "https://www.shine.com/myshine/login/?next=/myshine/mydashboard/");
        System.out.println(map);
        map.put("no",1545);
        System.out.println(map);
        System.out.println(map.get("URl"));
	}

}
