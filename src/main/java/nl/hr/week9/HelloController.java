package nl.hr.week9;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public Greeting hello() {
        return new Greeting("Hello, World!");
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static class Greeting {
        private String greeting = "";
    }
}
