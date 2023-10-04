import java.util.ArrayList;
public class Verification {

    public boolean validateAmountCharacter(String verifPassword) {
//      Verifique se a senha possui pelo menos 08 caracteres.
        if (verifPassword.length() < 8) {
            System.out.println("Digite uma senha com 8 digitos ou mais.");
            return false;
        }
        return true;
    }

    public boolean validateUpperCase(String verifPassword) {
        boolean isUpperCase = false;
        for (int i = 0; i < verifPassword.length(); i++) {
            verifPassword.charAt(i);
            if (Character.isUpperCase(verifPassword.charAt(i))) {
                isUpperCase = true;
                break;
            } else {
                isUpperCase = false;
            }
        }
        if (isUpperCase == false) {
            System.out.println("A senha precisa possuir pelo menos uma letra maiuscula");
        }
        return isUpperCase;
    }

    public boolean validateLowerCase(String verifPassword) {
        boolean isLowerCase = false;
        for (int i = 0; i < verifPassword.length(); i++) {
            verifPassword.charAt(i);
            if (Character.isLowerCase(verifPassword.charAt(i))) {
                isLowerCase = true;
                break;
            } else {
                isLowerCase = false;
            }
        }
        if (isLowerCase == false) {
            System.out.println("A senha precisa possuir pelo menos uma letra minuscula");
        }
        return isLowerCase;
    }

    public boolean validateNumeric(String verifPassword) {
        boolean isDigit = false;
        for (int i = 0; i < verifPassword.length(); i++) {
            verifPassword.charAt(i);
            if (Character.isDigit(verifPassword.charAt(i))) {
                isDigit = true;
                break;
            } else {
                isDigit = false;
            }
        }
        if (isDigit == false) {
            System.out.println("A senha precisa possuir pelo menos um dígito numérico");
        }
        return isDigit;
    }

    public boolean validateSpecialCharacter(String verifPassword) {
        boolean specialChar = false;
        String[] specialCharacter = new String[]{"!", "@", "#", "$", "%", "&", "*", "(", ",",
                ")", ",", "^", "~", "{", "}", ";", "/", "|"};
        for (int i = 0; i < specialCharacter.length; i++) {
            String character = specialCharacter[i];
            if (verifPassword.contains(character)) {
                specialChar = true;
                break;
            } else {
                specialChar = false;
            }
        }
        if (specialChar == false) {
            System.out.println("A senha precisa possuir pelo menos um caracter especial");
        }
        return specialChar;
    }
}
