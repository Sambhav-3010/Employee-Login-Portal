public class Username {
    String generateUsername(String firstName, String lastName, int lastI, String[] allUsernames){
        firstName = firstName.toLowerCase().strip();
        lastName = lastName.toLowerCase().strip();
        if (lastI > 5) {
            lastI -= 5;
        }
        if (lastI == 0) {
            ++lastI;
        }
        String random = Integer.toString((int)(Math.random()*Math.pow(10, lastI)));
        String username = firstName + lastName + random;
        if (usernameCheck(username, allUsernames)) {
            return username;
        }
        else{
            return generateUsername(firstName,lastName,++lastI,allUsernames);
        }
    }

    boolean usernameCheck(String username, String[] allUsernames){
        for (String allUsername : allUsernames) {
            if (allUsername.compareTo(username) == 0) {
                return false;
            }
        }
        return true;
    }
}