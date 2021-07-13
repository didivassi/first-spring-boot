package academy.mindswap.firstspringboot;

import academy.mindswap.firstspringboot.controllers.FrontPageController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FrontPageTests {

    @Autowired
    private FrontPageController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }
}
