package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@40113163;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24959
 */
public class ATV6X6JohnDeereMGator extends EntityType
{
    /** Default constructor */
    public ATV6X6JohnDeereMGator()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)90); // uid 24955, Recreational
        setSubCategory((byte)3); // uid 24958, ATV, 6X6
        setSpecific((byte)1); // uid 24959, ATV 6X6, John Deere M-Gator
    }
}
