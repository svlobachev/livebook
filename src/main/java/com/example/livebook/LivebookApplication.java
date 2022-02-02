package com.example.livebook;

import com.example.livebook.app.objects_of_world.personage.PersonageDefaultGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource("classpath:musicPlayer.properties")
public class LivebookApplication {

	private static PersonageDefaultGenerator personageOptionsGenerator;

	public LivebookApplication(PersonageDefaultGenerator personageOptionsGenerator) {
		LivebookApplication.personageOptionsGenerator = personageOptionsGenerator;
	}

	public static void main(String[] args) {
		SpringApplication.run(LivebookApplication.class, args);

		personageOptionsGenerator.generatePersonageOptions();


//		// Annotation based spring context
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.scan("com.example.livebook");
//		context.refresh();

//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		System.out.println(musicPlayer.playMusic());

//		context.close();

	}


}
