package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ef2d7a6;
 * Country: Kuwait (KWT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17913
 */
public class OPV310Classlargepatrolcraft extends EntityType
{
    /** Default constructor */
    public OPV310Classlargepatrolcraft()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17912, Light/Patrol Craft
        setSubCategory((byte)1); // uid 17913, OPV 310 Class (large patrol craft)
    }
}
