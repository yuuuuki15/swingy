package com.swingy.exception;

import java.util.Set;

import jakarta.validation.ConstraintViolation;

public class ValidationException extends Exception {
    private final Set<? extends ConstraintViolation<?>> violations;

    public ValidationException(Set<? extends ConstraintViolation<?>> violations) {
        super();
        this.violations = violations;
    }

    public Set<? extends ConstraintViolation<?>> getViolations() {
        return violations;
    }
}
