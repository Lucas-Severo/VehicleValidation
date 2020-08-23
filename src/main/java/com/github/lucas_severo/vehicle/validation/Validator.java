package com.github.lucas_severo.vehicle.validation;

/**
 *
 * @author lucas
 */
public interface Validator<T> {
    boolean validate(T object);
}
