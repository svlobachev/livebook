package com.example.livebook.app.objects_of_world.personage;

import com.example.livebook.app.objects_of_world.personage.options.PersonageOptionsSurvival;
import com.example.livebook.app.objects_of_world.personage.options.PersonageOptionsTemplate;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PersonageDefaultGenerator {
    private final PersonageOptionsTemplate personageOptionsTemplate;
    private final PersonageOptionsSurvival personageOptionsSurvival;
    HashMap<String, Object> level1Map = new HashMap<>();
    static int count = 0;
    static int i = 0;

    public PersonageDefaultGenerator(PersonageOptionsTemplate personageOptionsTemplate, PersonageOptionsSurvival personageOptionsSurvival) {
        this.personageOptionsTemplate = personageOptionsTemplate;
        this.personageOptionsSurvival = personageOptionsSurvival;
    }

    @SuppressWarnings("unchecked")
    private static int findReplaceValueByKey(String[] directionOfMovementAlongTheTreePath, String key, int newValue, HashMap<String, Object> map) {//recursive HashMap traversal
//        for (Object o : map.values()) {
        map.forEach((k, v) -> {
            if (v instanceof HashMap && directionOfMovementAlongTheTreePath[i].equals(k)) {
                i++;
                count = findReplaceValueByKey(directionOfMovementAlongTheTreePath, key, newValue, (HashMap<String, Object>) v);
            }
        });

        if (map.replace(key, newValue) != null) {
            count++;
        }
        return count;
    }

    public void generatePersonageOptions(){

        level1Map.put("bodyTemplate",  personageOptionsTemplate.getlevel1Map());
        level1Map.put("survival",  personageOptionsSurvival.getlevel1Map());
        String[] directionOfMovementAlongTheTreePath = {"bodyTemplate", "organs", "density"};

        System.out.println(findReplaceValueByKey(directionOfMovementAlongTheTreePath, "density", 1,level1Map));
        System.out.println(List.of(level1Map));

    }


}
