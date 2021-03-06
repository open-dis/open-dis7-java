package edu.nps.moves.dis7.entities.ind.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5adb0db3;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27228
 */
public class ShishumarClass extends EntityType
{
    /** Default constructor */
    public ShishumarClass()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23189, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 27228, Shishumar Class
    }
}
