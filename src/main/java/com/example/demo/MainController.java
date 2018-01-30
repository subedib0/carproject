package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {




    String output;
    @RequestMapping("/animal")
    public String main () {
        output = "";
        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());
        return output;

    }
    private void print (String s){
        // System.out.println(s);
        output += s;
    }
}




