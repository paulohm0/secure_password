public class Main {

    public static void main(String[] args) {

        Password password1 = new Password("Paulo1019%");
        Password password2 = new Password("Saulo0193#");
        System.out.println("A senha é: " + password1.getPassword());
        System.out.println("A senha é: " + password2.getPassword());

    }
}
