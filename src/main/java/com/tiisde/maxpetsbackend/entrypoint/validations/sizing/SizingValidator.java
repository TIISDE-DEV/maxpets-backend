package com.tiisde.maxpetsbackend.entrypoint.validations.sizing;

public class SizingValidator {
    private SizingValidator() {
    }

    public static boolean isValidSizing(SizingValidatorEnum sizing) {
        for (var validSizing : SizingValidatorEnum.values()) {
            if (sizing == validSizing) {
                return true;
            }
        }
        return false;
    }
}
