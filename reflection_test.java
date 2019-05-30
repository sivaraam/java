import java.util.*;
import java.lang.reflect.*;
import java.lang.String;

class Reflector {
	public static void main(String[] args) throws Exception {
		Set<String> s = new HashSet<String>();
		s.add("foo");
		Iterator it = s.iterator();
        // Bad idiom: don't use
        // Method m = it.getClass().getMethod("hasNext");
        Method m = Iterator.class.getMethod("hasNext");
		System.out.println(m.invoke(it));
	}
}
