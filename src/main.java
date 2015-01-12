import java.util.HashMap;

public class Main {
  
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "foo");
    map.put(2, "bar");
    map.put(3, "tmp");
    System.out.println(map);
  }

}