package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7de0c6ae;
 * Country: Kuwait (KWT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17915
 */
public class P302Aman extends EntityType
{
    /** Default constructor */
    public P302Aman()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17912, Light/Patrol Craft
        setSubCategory((byte)1); // uid 17913, OPV 310 Class (large patrol craft)
        setSpecific((byte)2); // uid 17915, P302 Aman
    }
}
