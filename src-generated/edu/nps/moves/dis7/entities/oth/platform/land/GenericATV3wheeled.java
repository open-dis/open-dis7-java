package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@678040b3
 * Country: Other
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 25955
 */
public class GenericATV3wheeled extends EntityType
{
    public GenericATV3wheeled()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)90); // uid 24835, Recreational
        setSubCategory((byte)4); // uid 25955, Generic ATV, 3-wheeled
    }
}