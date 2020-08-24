package com.github.lucas_severo.vehicle.validation;

public class PlacaValidator implements Validator<String> {

    @Override
    public boolean validate(String placa) {
        placa = removeHyphens(placa);
        placa = placa.toUpperCase();
        return placa.matches("[A-Z]{3}[0-9]{4}");
    }
    
    private String removeHyphens(String placa) {
        return placa.replace("-", "");
    }
    
}
