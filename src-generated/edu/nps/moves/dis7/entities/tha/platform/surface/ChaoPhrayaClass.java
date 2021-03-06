package edu.nps.moves.dis7.entities.tha.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@784abd3e;
 * Country: Thailand (THA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19058
 */
public class ChaoPhrayaClass extends EntityType
{
    /** Default constructor */
    public ChaoPhrayaClass()
    {
        setCountry(Country.THAILAND_THA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 19056, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 19058, Chao Phraya Class
    }
}
