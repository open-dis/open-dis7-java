package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ca33c24;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18065
 */
public class MIGG1900Classcoastalpatrolcraft extends EntityType
{
    /** Default constructor */
    public MIGG1900Classcoastalpatrolcraft()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18046, Light/Patrol Craft
        setSubCategory((byte)6); // uid 18065, MIG-G-1900 Class (coastal patrol craft)
    }
}
