package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;

public class UserFactory {

    //TODO: implement method body ONLY!
    public static User buildUser(String userEmail, String firstName, String lastName) {
        //throw new UnsupportedOperationException("Not supported yet.");

        return new User.Builder()
                .userEmail(userEmail)
                .firstName(firstName)
                .lastName(lastName)
                .build();
        //User user = new User(firstName, lastName);

        /**
         * Your implementation goes here
         * INSTRUCTIONS
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not supported yet.");]
         * 3. Build and return an object of User
         */
    }
}
