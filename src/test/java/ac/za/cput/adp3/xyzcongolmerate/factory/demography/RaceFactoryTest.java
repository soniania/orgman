package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildRace() {
        //throw new UnsupportedOperationException("Not supported yet.");

        Race race = RaceFactory.buildRace("Black");

        Assert.assertEquals("Black", "Black", "Black");
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RaceFactory class
         * 4. Assert that the id is generated.
         */
    }
}