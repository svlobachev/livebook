package com.example.livebook.app.objects_of_world.personage.options;

import org.springframework.stereotype.Component;
import java.util.HashMap;

@Component
public class PersonageOptionsSurvival {
    HashMap<String, Object> level1Map = new HashMap<>();



    public HashMap<String, Object> getlevel1Map() {
        level1Map.put("thirst", 0);
        level1Map.put("hungry", 0);
        level1Map.put("sleepy", 0);
        level1Map.put("emptying", 0);
        level1Map.put("body_hygiene", 0);
        level1Map.put("clothes_hygiene", 0);
        level1Map.put("thermoregulation", 0);
        level1Map.put("reproduction", 0);
        level1Map.put("safety", 0);

        return level1Map;
    }
}
