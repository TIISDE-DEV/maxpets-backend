package com.tiisde.maxpetsbackend.validations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.tiisde.maxpetsbackend.entrypoint.validations.design.DesignValidator;
import com.tiisde.maxpetsbackend.entrypoint.validations.design.DesignValidatorEnum;

class DesignValidatorTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Test DesignValidator with valid input")
    void testDesignValidator_WithValidInput() {
        DesignValidatorEnum validDesign = DesignValidatorEnum.EXCELLENT;
        var sut = DesignValidator.isValidDesign(validDesign);
        assertTrue(sut);
    }

    @Test
    @DisplayName("Test DesignValidator with invalid input")
    void testDesignValidator_WithInvalidInput() {
        DesignValidatorEnum invalidDesign = null;
        var sut = DesignValidator.isValidDesign(invalidDesign);
        assertFalse(sut);
    }
}
