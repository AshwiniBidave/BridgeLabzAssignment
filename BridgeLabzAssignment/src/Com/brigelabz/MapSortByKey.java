package Com.brigelabz;
import java.util.*;

public class MapSortByKey {
	public static String[] getValues(Map<String, String> map) {
		List<String> values = new ArrayList<>(map.values());
		Collections.sort(values);
		return values.toArray(new String[0]);
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "1");
		map.put("b", "3");
		map.put("c", "2");
		
		Map<String, String> m = new HashMap<>();
		m.put("a", "Apple");
		m.put("b", "Microsoft");
		m.put("c", "Google");
	

		String[] result1 = getValues(map);
		System.out.println(Arrays.toString(result1));
		String[] result2 = getValues(m);
		System.out.println(Arrays.toString(result2));

	}
}
