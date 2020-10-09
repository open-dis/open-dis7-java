package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4d4d48a6
 * Country: Other
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 25801
 */
public class GenericShuttleBus extends EntityType
{
    public GenericShuttleBus()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)82); // uid 25798, Bus
        setSubCategory((byte)3); // uid 25801, Generic Shuttle Bus
    }
}
