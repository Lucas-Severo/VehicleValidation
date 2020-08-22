package com.lrs.vehicle.validation;

/**
 *
 * @author lucas
 */
public class RenavamValidator implements Validator<String> {

    @Override
    public boolean validate(String input) {
        input = adjustRenavam(input);
        if(!input.matches("[0-9]{11}")) {
            return false;
        }

        String reversedInput = getReversedWord(input);

        int checkDigit = getCheckDigit(input);
        int checkDigitResult = calculateCheckDigit(reversedInput);

        return checkDigit == checkDigitResult;
    }
    
    private static String adjustRenavam(String renavam) {
        if(renavam.length() == 9) {
            return "00"+renavam;
        }
        return renavam;
    }

    private String getReversedWord(String renavam) {
        return new StringBuffer(renavam.substring(0, 10)).reverse().toString();
    }
    
    private int getCheckDigit(String renavam) {
        return Integer.parseInt(renavam.substring(10, 11));
    }
    
    private int calculateCheckDigit(String renavam) {
        int sum = 0;

        for(int index = 0; index < 8; index++) {
            sum += Integer.parseInt(renavam.substring(index, index+1)) * (index+2);
        }
        sum += (Integer.parseInt(renavam.substring(8, 9))*2) + (Integer.parseInt(renavam.substring(9, 10))*3);
        
        int result = 11-(sum%11);
        
        if(result >= 10) {
            return 0;
        }
        
        return result;
    }
}
