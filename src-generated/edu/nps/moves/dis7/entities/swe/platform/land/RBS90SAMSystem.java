package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@672b72ba;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25420
 */
public class RBS90SAMSystem extends EntityType
{
    /** Default constructor */
    public RBS90SAMSystem()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 17483, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)3); // uid 25420, RBS 90 SAM System
    }
}
