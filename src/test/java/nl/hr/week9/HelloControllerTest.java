package nl.hr.week9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {
    @Test
    void hello() {
        final var helloController = new HelloController();

        final var greeting = helloController.hello();

        assertThat(greeting).isNotNull();
        assertThat(greeting.getGreeting()).isEqualTo("Hello, World!");
    }
}