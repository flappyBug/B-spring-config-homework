package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = { "levelNumber=1" })
class AdvancedLevelControllerTest {
    @Autowired LevelController levelController;
    @Test
    void should_return_advanced_if_level_number_is_less_than_one() {
        assertEquals("advanced", levelController.getLevel());
    }
}