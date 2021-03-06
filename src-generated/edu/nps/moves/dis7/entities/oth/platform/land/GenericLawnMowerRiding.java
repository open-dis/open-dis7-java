package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7726e185;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25926
 */
public class GenericLawnMowerRiding extends EntityType
{
    /** Default constructor */
    public GenericLawnMowerRiding()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)88); // uid 25920, Farm Specialty Vehicle
        setSubCategory((byte)6); // uid 25926, Generic Lawn Mower, Riding
    }
}
