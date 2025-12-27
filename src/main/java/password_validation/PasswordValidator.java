package password_validation;

public class PasswordValidator {
    // Current credentials
    static String username = "jane_doe";
    static String currentPassword = "passw0rd";

    static boolean checkSpecialChars(String word) {
        var checkResult = false;
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetterOrDigit(word.charAt(i)) && !(Character.isWhitespace(word.charAt(i)))) {
                checkResult = true;
                break;
            }

        }
        return checkResult;
    }

    static boolean validatePassword(String newPassword) {
        boolean result = false;

        if (newPassword.length() < 8) {
            System.out.println(result);
            System.out.println("Your password must be at least 8 characters long");
        } else if (!newPassword.matches(".*[A-Z].*")) {
            System.out.println(result);
            System.out.println("Your password must include an uppercase");
        } else if (newPassword.equals(username)) {
            System.out.println(result);
            System.out.println("Your password cannot be your username");
        } else if (!checkSpecialChars(newPassword)) {
            System.out.println(result);
            System.out.println("Your password must include a special character");
        } else if (newPassword.equals(currentPassword)) {
            System.out.println(result);
            System.out.println("Your new password cannot be your former password");
        } else {
            result = true;
        }


        /***************************************************
         * TODO: Your code goes here
         *
         * Criteria:
         *   at least 8 characters long
         *   contains an uppercase letter
         *   contains a special character
         *   does not contain the username
         *   is not the same as the old password
         */


        return result;
    }
}
