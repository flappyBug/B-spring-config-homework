package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("basic")
class BasicLevelControllerTest {
@Autowired LevelController levelController;
    @Test
    void should_return_basic_if_level_number_less_than_one() {
        assertEquals("basic", levelController.getLevel());
    }
}