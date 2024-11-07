package java8;

import java.util.Arrays;
import java.util.List;

public class DemoStream {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("mohan","arbaz","raja","khan","anshika");
		name.stream().filter(x->x.startsWith("a")).forEach(x-> System.out.println(x));
			
			
			
	}

} 
