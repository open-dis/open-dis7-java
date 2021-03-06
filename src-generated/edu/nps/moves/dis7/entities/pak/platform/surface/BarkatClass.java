package edu.nps.moves.dis7.entities.pak.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1d81e101;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19342
 */
public class BarkatClass extends EntityType
{
    /** Default constructor */
    public BarkatClass()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19339, Light/Patrol Craft
        setSubCategory((byte)3); // uid 19342, Barkat Class
    }
}
