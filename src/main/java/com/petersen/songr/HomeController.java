package com.petersen.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller // tells spring to look at this class and use its methods to establish routes
public class HomeController {
    @GetMapping("/")                         // this is our app.get("/")
    public String showHome(){                // all mapping methods must be public and return strings
        return "home";                       // a filename for the thymeleaf file we want to render(html file)
        // think like ejs, we returned "home.ejs" if we wanted to render that specific file.
    }

    @GetMapping("/greeting/{to}")                                                       //localhost:8080/greeting?person="Mike"&lastSeen=0&message="hi"
    public String sayHello(Model mPotato,
                           String person,
                           Integer lastSeen,
                           String message,
                           @PathVariable String to){           // get mapping's params assume Query String params

        System.out.println(String.format("Message from %s : its been %d days since I saw you, %s", person, lastSeen, message));

        mPotato.addAttribute("person", person);
        mPotato.addAttribute("daysSinceISawYou", lastSeen);
        mPotato.addAttribute("message", message);

        return "hello";
    }
    @GetMapping("/capitalize/{to}")
    public String capitalize(Model mPotato,
                             @PathVariable String to){
        System.out.println(to.toUpperCase());

        mPotato.addAttribute("message", to.toUpperCase());
        return "capitalize";
    }
//    @GetMapping("/album")
}
