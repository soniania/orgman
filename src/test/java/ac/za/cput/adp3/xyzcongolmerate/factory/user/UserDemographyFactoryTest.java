package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUserDemography() {
        //throw new UnsupportedOperationException("Not supported yet.");

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("Ssontshatsha@gmail.com","Ms", "2","10", "1997/06/10"));

        Assert.assertNotNull(userDemography.getUserTitle());
        Assert.assertNotNull(userDemography.getUserEmail());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserDemographyFactory class
         * 4. Assert that the an object is created.
         */
    }
}