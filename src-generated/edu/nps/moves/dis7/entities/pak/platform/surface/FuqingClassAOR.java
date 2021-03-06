package edu.nps.moves.dis7.entities.pak.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2577d6c8;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19344
 */
public class FuqingClassAOR extends EntityType
{
    /** Default constructor */
    public FuqingClassAOR()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19343, Auxiliary
        setSubCategory((byte)1); // uid 19344, Fuqing Class (AOR)
    }
}
