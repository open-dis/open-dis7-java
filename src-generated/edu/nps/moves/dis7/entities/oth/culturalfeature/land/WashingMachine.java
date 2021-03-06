package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@48d44b46;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 26492
 */
public class WashingMachine extends EntityType
{
    /** Default constructor */
    public WashingMachine()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)22); // uid 26475, Appliances
        setSubCategory((byte)2); // uid 26487, Indoor
        setSpecific((byte)5); // uid 26492, Washing Machine
    }
}
