package edu.nps.moves.dis7.entities.lbn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@70fab835;
 * Country: Lebanon (LBN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17981
 */
public class AztecClasscoastalpatrolcraft extends EntityType
{
    /** Default constructor */
    public AztecClasscoastalpatrolcraft()
    {
        setCountry(Country.LEBANON_LBN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17979, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17981, Aztec Class (coastal patrol craft)
    }
}
