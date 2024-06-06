public class Password {
    String generatePassword(int passwordLength) {
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        char[] password = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            int random = (int) (Math.random() * characterSet.length());
            password[i] = characterSet.charAt(random);
        }
        return new String(password);
    }
}
