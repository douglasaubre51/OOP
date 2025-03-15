package realtime.videocall.app.controllers;

import realtime.videocall.app.models.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AyaneUserController {
    @GetMapping
    public String getUser() {
        return "i am get!";
    }

    @PostMapping("users")
    public String createNewUser(@RequestBody Person person) {
        System.out.println(person);
        return person.name + "\t" + person.email + "\t" + person.password;
    }
}