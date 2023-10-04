public class Password extends Verification{

    private String password;

    public Password(String password) {
        setPassword(password);

    }

    public void setPassword(String password) {
        if (validateAmountCharacter(password) &&
            validateUpperCase(password) &&
            validateLowerCase(password) &&
            validateNumeric(password) &&
            validateSpecialCharacter(password)) {
            this.password = password;
        } else {
            System.out.println("A entrada não segue todos os parâmetros, tente novamente.");
        }
    }
    public String getPassword() {
        return password;
    }
}
