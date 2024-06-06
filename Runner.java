public class Runner {
    public static void main(String[] args) {
        String[] allEmails = {};
        String[] allUsernames = {};
        Employee ob = new Employee();
        ob.inputDetails();
        ob.generateEmail(allEmails);
        ob.generateUsername(allUsernames);
        ob.generatePassword();
        ob.printDetails();
    }
}
