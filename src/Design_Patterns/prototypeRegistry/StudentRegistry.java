package Design_Patterns.prototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();
    /*
    Inserts Student objects in the registry and
    returns them when needed
     */
    void register(String key, Student student){
        map.put(key, student);
    }

    Student get(String key){
        return map.get(key);
    }
}
