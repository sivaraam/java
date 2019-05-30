import java.util.Collection;
import java.util.ArrayList;

interface A {}
class B implements A {}
class C implements A {}

class GenericForEach {
  public static void main(String... arg) {
    Collection<A> objList = new ArrayList<>();
    objList.add(new B());
    objList.add(new C());
    for(A a : objList)
      System.out.println(a);
  }
}
