package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class RaceFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(RaceFactory.class); // Expecting RF from (R)ace(F)actory.

    //TODO: implement method body ONLY!
    public static Race buildRace(String raceDescription) {
        //throw new UnsupportedOperationException("Not supported yet.");

        return  new Race.Builder()
                .raceId(SUFFIX)
                .raceDescription(raceDescription)
                .build();
        /**
         * Your implementation goes here
         * INSTRUCTIONS
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not supported yet.");]
         * 3. Generate random id using SUFFIX (Hint: call generateRandomGivenSuffix method in Helper class)
         * 4. Build and return an object of Race
         */
    }
}
