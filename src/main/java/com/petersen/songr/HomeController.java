package com.petersen.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                                // tells spring to look at this class and use its methods to establish routes
public class HomeController {
    @GetMapping("/")                       // this is our app.get("/").    //Getmapping is an annotation for get requests
    public String showHome(){              // all mapping methods must be public and return strings
        return "home";                     // a filename for the thymeleaf file we want to render(html file)
                                           // think like ejs, we returned "home.ejs" if we wanted to render that specific file.
    }
}
