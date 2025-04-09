package com.uncle.kangarooquiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/kangaroo")
public class Controller {

    @GetMapping("/game")
    public String game(){
        return "game";
    }

    @GetMapping("/quiz")
    public String quiz(){
        return "quiz";
    }

    @GetMapping("/cards")
    public String flashCards(){
        return "cards";
    }
}
