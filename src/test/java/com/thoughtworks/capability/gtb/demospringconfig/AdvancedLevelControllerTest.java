package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestPropertySource
@SpringBootTest
class AdvancedLevelControllerTest {

    @Autowired LevelController levelController;

    @Test
    void should_return_advanced_if_level_number_ge_one() {
        assertEquals("advanced", levelController.getLevel());
    }
}