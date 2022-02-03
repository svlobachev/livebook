package com.example.livebook.app.objects_of_world.personage.options;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Objects;

@Component
public class PersonageOptionsTemplate {
    HashMap<String, Object> level1Map = new HashMap<>();
    HashMap<String, Object> level2Map = new HashMap<>();


    public HashMap<String, Object> getlevel1Map() {
        level2Map.put("density", 0);
        level2Map.put("block", 0);
        level2Map.put("resistance", 0);
        level2Map.put("transparency", 0);
        level2Map.put("shine", 0);
        level2Map.put("smell", 0);
        level2Map.put("sound", 0);
        level2Map.put("color", "Color");

        level1Map.put("TEST", 0);
        level1Map.put("hair", level2Map);
        level1Map.put("skin", level2Map);
        level1Map.put("blood", level2Map);
        level1Map.put("bones", level2Map);
        level1Map.put("muscle", level2Map);
        level1Map.put("organs", level2Map);

        return level1Map;
    }


}
