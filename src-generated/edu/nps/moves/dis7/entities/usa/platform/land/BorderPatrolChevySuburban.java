package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6d229b1c
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28329
 */
public class BorderPatrolChevySuburban extends EntityType
{
    public BorderPatrolChevySuburban()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 24960, Utility/Emergency Car
        setSubCategory((byte)2); // uid 28324, Police Car
        setSpecific((byte)3); // uid 28328, Police Car, Chevy Suburban
        setExtra((byte)1); // uid 28329, Border Patrol, Chevy Suburban
    }
}
