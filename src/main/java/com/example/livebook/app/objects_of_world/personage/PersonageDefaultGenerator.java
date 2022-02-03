package com.example.livebook.app.objects_of_world.personage;

import com.example.livebook.app.objects_of_world.personage.options.PersonageOptionsAccount;
import com.example.livebook.app.objects_of_world.personage.options.PersonageOptionsSurvival;
import com.example.livebook.app.objects_of_world.personage.options.PersonageOptionsTemplate;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PersonageDefaultGenerator {
    private final PersonageOptionsTemplate personageOptionsTemplate;
    private final PersonageOptionsSurvival personageOptionsSurvival;
    private final PersonageOptionsAccount personageOptionsAccount;

    public PersonageDefaultGenerator(PersonageOptionsTemplate personageOptionsTemplate,
                                     PersonageOptionsSurvival personageOptionsSurvival,
                                     PersonageOptionsAccount personageOptionsAccount) {
        this.personageOptionsTemplate = personageOptionsTemplate;
        this.personageOptionsSurvival = personageOptionsSurvival;
        this.personageOptionsAccount = personageOptionsAccount;
    }


    public void generatePersonageOptions(){
        HashMap<String, Object> level1Map = new HashMap<>();
        level1Map.put("bodyTemplate",  personageOptionsTemplate.getlevel1Map());
        level1Map.put("survival",  personageOptionsSurvival.getlevel1Map());
        level1Map.put("account",  personageOptionsAccount.getlevel1Map());

        System.out.println(List.of(level1Map));

    }


}
