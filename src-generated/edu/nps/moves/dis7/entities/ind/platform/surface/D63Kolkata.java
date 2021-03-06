package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ce1d6d0;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28872
 */
public class D63Kolkata extends EntityType
{
    /** Default constructor */
    public D63Kolkata()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18824, Guided Missile Destroyer (DDG)
        setSubCategory((byte)3); // uid 28871, Kolkata Class
        setSpecific((byte)1); // uid 28872, D63 Kolkata
    }
}
