package com.mech2dude.springboot.demo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {


    //  inject properties for coach name and team name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for team info
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // expose the "/" that return hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello world! Time on the server is " + LocalDateTime.now();
    }

    // expose a new end point for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    // expose a new end point for timepass
    @GetMapping("/timepass")
    public String getTimePass(){
        return "Time is Money";
    }

    // expose a new end point for fortune
    @GetMapping("/getfortune")
    public  String getFortune(){
        return "Today is your lucky day";
    }
}
