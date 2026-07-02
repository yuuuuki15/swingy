package com.swingy.service;

import java.util.Set;

import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import com.swingy.exception.ValidationException;
import com.swingy.model.Armor;
import com.swingy.model.Artifact;
import com.swingy.model.ArtifactType;
import com.swingy.model.Helm;
import com.swingy.model.Weapon;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

public class ArtifactFactory {
    private static final ArtifactFactory INSTANCE = new ArtifactFactory();
    private final Validator validator;

    private ArtifactFactory() {
        this.validator = Validation.byDefaultProvider()
                                    .configure()
                                    .messageInterpolator(new ParameterMessageInterpolator())
                                    .buildValidatorFactory()
                                    .getValidator();
    }

    public static ArtifactFactory getInstance() {
        return INSTANCE;
    }

    public Artifact create(String name, ArtifactType type, int increaseValue) throws AssertionError, ValidationException{
        Artifact artifact;
        switch (type) {
            case WEAPON:
                artifact = new Weapon(name, increaseValue);
                break;
            case ARMOR:
                artifact = new Armor(name, increaseValue);
                break;
            case HELM:
                artifact = new Helm(name, increaseValue);
                break;
            default:
                throw new AssertionError();
        }

        Set<ConstraintViolation<Artifact>> constraintViolations = this.validator.validate(artifact);

        if (!constraintViolations.isEmpty()) {
            throw new ValidationException(constraintViolations);
        }

        return (artifact);
    }
}
