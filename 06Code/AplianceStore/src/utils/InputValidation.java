/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class InputValidation {

    public static boolean validateCharacters(String data) {

        boolean isCharacter = true;

        if (!data.matches("^[\\p{L} .'-]+$")) {
            isCharacter = false;
        }

        return isCharacter;

    }

    public static boolean isNumber(String data) {

        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
