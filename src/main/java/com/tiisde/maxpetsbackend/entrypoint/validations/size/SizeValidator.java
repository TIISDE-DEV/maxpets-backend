package com.tiisde.maxpetsbackend.entrypoint.validations.size;

public class SizeValidator {
    private SizeValidator() {
    }

    public static boolean isValidSize(SizeValidatorEnum size) {
        for (var validSize : SizeValidatorEnum.values()) {
            if (size == validSize) {
                return true;
            }
        }
        return false;
    }
}
