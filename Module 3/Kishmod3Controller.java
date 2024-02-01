package com.example.springboot;
import java.util.Random;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kishmod3Controller {
    
    @RequestMapping("/Hello")
    public String Greeting(){
        return "Cheers Mate Welcome";
    }

    @RequestMapping("/Goodbye")
    public String Goodbye(){
        return "Goodbye Mate";
    }

    @RequestMapping("/WhyYouHere")
    public String whyYouHere() {
        Random random = new Random();
        int randomValue = random.nextInt(2);
        if (randomValue == 0) {
            return "Why are you here?";
        } else {
            return "It's a mystery why you're here!";
        }
    }

    @RequestMapping("Random")
    public String Random(){
        Random random = new Random();
        int randomIndex = random.nextInt(messages.length);
        return messages[randomIndex];
    }
    private static final String[] messages = {"How Are You Doing Today", "Check it out", "Random AF"};
}