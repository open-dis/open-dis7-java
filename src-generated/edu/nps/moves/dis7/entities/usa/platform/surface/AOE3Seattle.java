package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a65a360;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 12085
 */
public class AOE3Seattle extends EntityType
{
    /** Default constructor */
    public AOE3Seattle()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)60); // uid 12081, Fast Combat Support Ship
        setSubCategory((byte)1); // uid 12082, Sacramento Class
        setSpecific((byte)3); // uid 12085, AOE 3 Seattle
    }
}
