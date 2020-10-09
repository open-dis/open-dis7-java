package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1162410a
 * Country: Other
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 31601
 */
public class GenericSweeperRotary extends EntityType
{
    public GenericSweeperRotary()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 25881, Construction Specialty Vehicle
        setSubCategory((byte)42); // uid 31601, Generic Sweeper, Rotary
    }
}
