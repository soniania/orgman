package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;

import java.util.Date;

public class UserDemographyFactory {

    //TODO: implement method body ONLY!
    public static UserDemography buildUserDemography(String userEmail, String userTitle, String genderId, String raceId, Date dateOfBirth) {
        //throw new UnsupportedOperationException("Not supported yet.");

        UserDemography userDemography = new UserDemography(userEmail, userTitle, genderId, raceId, dateOfBirth);
        return userDemography;
        /**
         * Your implementation goes here
         * INSTRUCTIONS
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not supported yet.");]
         * 3. Create and return an object of UserDemography
         */
    }
}
