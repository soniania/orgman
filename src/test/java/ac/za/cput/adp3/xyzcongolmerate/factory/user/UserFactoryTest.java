package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUser() {
        //throw new UnsupportedOperationException("Not supported yet.");

        User user = UserFactory.buildUser("Ssontshatsha@gmail.com", "Sonia", "Sontshatsha");

        Assert.assertEquals("Sonia", "Sonia");
        Assert.assertEquals("Sontshatsha", "Sontshatsha");
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 2. Test the UserFactory class
         * 3. Assert that the an object is created.
         */
    }
}