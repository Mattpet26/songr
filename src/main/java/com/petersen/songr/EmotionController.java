package com.petersen.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class EmotionController {
    @GetMapping("/emotions")
    public String showEmotions(Model m){
        ArrayList<Emotion> emotions = new ArrayList<>();
        emotions.add(new Emotion(
                "Chill",
                false,
                "Jack",
                6,
                "Cause I am learning"
        ));
        emotions.add(new Emotion("Happy", false, "Matthew", 10, "Wife just got home"));

        emotions.add(new Emotion(
                "Sad",
                true,
                "Paul",
                9,
                "I hate learning java"
        ));
        m.addAttribute("feelings", emotions);
        return "feelings";
    }
}
