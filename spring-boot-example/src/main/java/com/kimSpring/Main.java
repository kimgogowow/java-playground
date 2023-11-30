package com.kimSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
    @GetMapping("/greet")
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse("hellooooo",
                List.of("Java","Golang"),
                new Person("Alex"));//this is the value
        return response;
    }
    @GetMapping("/eating")
    public GreetResponse eating(){
        return new GreetResponse("having food",
                List.of("Java","Golang"),
                new Person("Alex222"));
    }
    record Person(String name){

    }
    record GreetResponse(
            String greet,
            List<String> favLangs,
            Person person

            ){ }
}
/*
    class GreetResponse{
        private final String greet;//greet is the key
        GreetResponse(String greet){
            this.greet = greet;
        }
        public String getGreet(){
            return greet;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj == null || getClass() != obj.getClass()) return false;
            GreetResponse that = (GreetResponse) obj;
            return Objects.equals(greet,that.greet);
        }

        @Override
        public String toString(){
            return "greetresponse{"+" greet =' "+greet+'\''+"}";
        }
    }

*/