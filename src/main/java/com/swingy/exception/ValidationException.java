package com.swingy.exception;

import java.util.Set;

import com.swingy.model.Hero;

import jakarta.validation.ConstraintViolation;

public class ValidationException extends Exception {
    private final Set<ConstraintViolation<Hero>> violations;

    public ValidationException(Set<ConstraintViolation<Hero>> violations) {
        super();
        this.violations = violations;
    }

    public Set<ConstraintViolation<Hero>> getViolations() {
        return violations;
    }
}
