package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@525575;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23184
 */
public class K46Vipul extends EntityType
{
    /** Default constructor */
    public K46Vipul()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18858, Frigate (including Corvette)
        setSubCategory((byte)3); // uid 23177, Veer (Tarantul 1) class
        setSpecific((byte)7); // uid 23184, K46 Vipul
    }
}
