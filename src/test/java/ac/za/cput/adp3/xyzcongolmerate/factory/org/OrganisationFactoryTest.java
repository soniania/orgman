package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildOrganisation() {
        //throw new UnsupportedOperationException("Not supported yet.");

        Organisation organisation = OrganisationFactory.buildOrganisation("Equal Education");

        Assert.assertNotNull(organisation.getOrgName());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the OrganisationFactory class
         * 4. Assert that the id is generated.
         */
    }
}