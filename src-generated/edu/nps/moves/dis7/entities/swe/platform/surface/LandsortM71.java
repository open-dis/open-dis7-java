package edu.nps.moves.dis7.entities.swe.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@508a65bf
 * Country: Sweden (SWE)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 26834
 */
public class LandsortM71 extends EntityType
{
    public LandsortM71()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 26832, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 26833, Landsort Class
        setSpecific((byte)1); // uid 26834, Landsort (M71)
    }
}
