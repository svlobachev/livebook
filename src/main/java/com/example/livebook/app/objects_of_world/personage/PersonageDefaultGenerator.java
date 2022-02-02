package com.example.livebook.app.objects_of_world.personage;

import com.example.livebook.app.objects_of_world.personage.options.PersonageOptionsSurvival;
import com.example.livebook.app.objects_of_world.personage.options.PersonageOptionsTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class PersonageDefaultGenerator {
    private final PersonageOptionsTemplate personageOptionsTemplate;
    private final PersonageOptionsSurvival personageOptionsSurvival;

    public PersonageDefaultGenerator(PersonageOptionsTemplate personageOptionsTemplate, PersonageOptionsSurvival personageOptionsSurvival) {
        this.personageOptionsTemplate = personageOptionsTemplate;
        this.personageOptionsSurvival = personageOptionsSurvival;
    }

    public void generatePersonageOptions(){
        HashMap<String, Object> level1Map = new HashMap<>();
       ;
        level1Map.put("bodyTemplate",  personageOptionsTemplate.getlevel1Map());
        level1Map.put("survival",  personageOptionsSurvival.getlevel1Map());

        System.out.println(List.of(level1Map));

    }
}