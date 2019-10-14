import java.util.HashMap;
import java.util.Map;

public class mMap {
    public static void main(String[] args) {
        Map<String, String> mapNameToLocation = new HashMap<String, String>();
        System.out.println("newly created map");
        System.out.println("------------------");
        System.out.println("map: " + mapNameToLocation);
        System.out.println("size: " + mapNameToLocation.size());
        System.out.println("Winnie?:" + mapNameToLocation.get("Winnie"));

        mapNameToLocation.put("Winnie", "Hundred acre wood");

        System.out.println("post put Winnie");
        System.out.println("---------------");
        System.out.println("map: " + mapNameToLocation);
        System.out.println("size: " + mapNameToLocation.size());
        System.out.println("Winnie?:" + mapNameToLocation.get("Winnie"));
    }
}
