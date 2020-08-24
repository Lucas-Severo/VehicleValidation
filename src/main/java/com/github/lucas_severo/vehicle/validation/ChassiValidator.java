package com.github.lucas_severo.vehicle.validation;

import java.util.HashMap;
import java.util.Map;

public class ChassiValidator implements Validator<String> {

    private static Map<String, Integer> values = null;
    private static Map<Integer, Integer> weights = null;
    
    @Override
    public boolean validate(String chassi) {
        chassi = chassi.replace("-", "");
        if(chassi.length() != 17) {
            return false;
        }
        populateMaps();
        chassi = chassi.toUpperCase();
        
        int checkDigitReal = getCheckDigit(chassi);
        int calculatedCheckDigit = calculateCheckDigit(chassi);

        return checkDigitReal == calculatedCheckDigit;
    }
    
    private void populateMaps() {
        if(values == null) {
            values = new HashMap<String, Integer>() {
                {
                    put("A", 1); put("B", 2); put("C", 3); put("D", 4); put("E", 5);
                    put("F", 6); put("G", 7); put("H", 8); put("I", 0); put("J", 1);
                    put("K", 2); put("L", 3); put("M", 4); put("N", 5); put("O", 0);
                    put("P", 7); put("Q", 0); put("R", 9); put("S", 2); put("T", 3);
                    put("U", 4); put("V", 5); put("W", 6); put("X", 7); put("Y", 8);
                    put("Z", 9);
                }
            };

            weights = new HashMap<Integer, Integer>() {
                {
                    put(1, 8); put(2, 7); put(3, 6); put(4, 5); put(5, 4);
                    put(6, 3); put(7, 2); put(8, 10); put(9, 0); put(10, 9);
                    put(11, 8); put(12, 7); put(13, 6); put(14, 5); put(15, 4);
                    put(16, 3); put(17, 2);
                }
            };
        }
    }
    
    private int getCheckDigit(String chassi) {
        String digit = chassi.substring(8, 9);
        return digit.equals("X") ? 10: Integer.parseInt(digit);
    }

    private int calculateCheckDigit(String chassi) {
        int sum = 0;

        for(int index = 0; index < 17; index++) {
            if(index != 8) {
                String character = chassi.substring(index, index+1);
                int value;
                
                if(isNumber(character.charAt(0))) {
                    value = Integer.parseInt(character);
                } else if(isInvalidCharacter(character.charAt(0))) {
                    return -1;
                } else {
                    value = values.get(character);
                }
                
                int pos = weights.get(index+1);
                sum += value * pos;
            }
        }

        return sum%11;
    }
    
    private boolean isNumber(char digit) {
        return digit >= 48 && digit <= 57;
    }
    
    private boolean isInvalidCharacter(char character) {
        return character < 65 || character > 90;
    }
}
