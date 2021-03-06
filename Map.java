import java.util.*;

public class Map {

	public static void main(String[] args) {
		Map m = new HashMap(10);
		m.put("A",100);
		m.put("B",200);
		m.put("C",300);
		m.put("D",400);
		
		for (Map.Entry mapElement : m.entrySet())
		{
			int key= (int)mapElement.getKey();
        String value= (String)mapElement.getValue();
        System.out.println(key + " : "+ value);
		}
	}
}
