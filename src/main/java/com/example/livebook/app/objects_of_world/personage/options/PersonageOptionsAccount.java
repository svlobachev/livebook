package com.example.livebook.app.objects_of_world.personage.options;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class PersonageOptionsAccount {
    HashMap<String, Object> level1Map = new HashMap<>();

    public HashMap<String, Object> getlevel1Map() {
        level1Map.put("nickname", "yourAccount");
        level1Map.put("positionX", 0);
        level1Map.put("positionY", 0);
        level1Map.put("positionZ", 0);

        return level1Map;
    }
}
