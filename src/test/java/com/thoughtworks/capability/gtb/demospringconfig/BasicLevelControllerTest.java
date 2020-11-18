package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(properties = { "levelNumber=0" })
class BasicLevelControllerTest {
    @Autowired LevelController levelController;
    @Test
    void should_return_basic_if_level_number_is_less_than_one() {
        assertEquals("basic", levelController.getLevel());
    }
}