package com.swingy.service;

import java.util.Set;

import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import com.swingy.exception.ValidationException;
import com.swingy.model.Archer;
import com.swingy.model.Hero;
import com.swingy.model.HeroType;
import com.swingy.model.Hunter;
import com.swingy.model.Knight;
import com.swingy.model.Princess;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

public class HeroFactory {
    private final static HeroFactory INSTANCE = new HeroFactory();
    private final Validator validator;

    private HeroFactory(){
        this.validator = Validation.byDefaultProvider()
                                    .configure()
                                    .messageInterpolator(new ParameterMessageInterpolator())
                                    .buildValidatorFactory()
                                    .getValidator();
    }

    public static HeroFactory getInstance() {
        return INSTANCE;
    }

    public Hero create(String name, HeroType type) throws AssertionError, ValidationException{
        Hero hero;
        switch (type) {
            case ARCHER:
                hero = new Archer(name);
                break;
            case HUNTER:
                hero = new Hunter(name);
                break;
            case KNIGHT:
                hero = new Knight(name);
                break;
            case PRINCESS:
                hero = new Princess(name);
                break;
            default:
                throw new AssertionError();
        }

        Set<ConstraintViolation<Hero>> constraintViolations = this.validator.validate(hero);

        if (!constraintViolations.isEmpty()) {
            throw new ValidationException(constraintViolations);
        }

        return (hero);
    }
}
