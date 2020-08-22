package com.lrs.vehicle.validation;

/**
 *
 * @author lucas
 */
public interface Validator<T> {
    boolean validate(T object);
}
