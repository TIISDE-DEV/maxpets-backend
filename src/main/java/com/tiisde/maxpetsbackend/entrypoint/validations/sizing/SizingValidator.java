package com.tiisde.maxpetsbackend.entrypoint.validations.sizing;

public class SizingValidator {
    public boolean isValidSizing(SizingValidatorEnum sizing) {
        for (var validSizing : SizingValidatorEnum.values()) {
            if (sizing == validSizing) {
                return true;
            }
        }
        return false;
    }
}
