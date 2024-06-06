public class Email {
    String generateEmail(String firstName,String lastName,String department, String[] allEmails,int lastI){
        if (lastI > 5) {
            lastI -= 5;
        }
        if (lastI == 0) {
            ++lastI;
        }
        firstName = firstName.toLowerCase().strip();
        lastName = lastName.toLowerCase().strip();
        department = department.toLowerCase().strip();
        String email = Integer.toString((int)(Math.random()*Math.pow(10, lastI)));;
        String generatedEmail = firstName + "."+lastName.charAt(0) + email+"@"+department+".company";
        if (emailCheck(generatedEmail, allEmails)) {
            return generatedEmail;
        }
        else{
            return generateEmail(firstName,lastName,department,allEmails,++lastI);
        }
        
    }
    boolean emailCheck(String email, String[] allEmails){
        for (String allEmail : allEmails) {
            if (email.compareTo(allEmail) == 0) {
                return false;
            }
        }
        return true;
    }
}
