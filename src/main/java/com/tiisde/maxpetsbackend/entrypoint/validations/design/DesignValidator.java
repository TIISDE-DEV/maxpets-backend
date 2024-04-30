package com.tiisde.maxpetsbackend.entrypoint.validations.design;

public class DesignValidator {
    public boolean isValidDesign(DesignValidatorEnum design) {
        for (var validDesign : DesignValidatorEnum.values()) {
            if (design == validDesign) {
                return true;
            }
        }
        return false;
    }
}
