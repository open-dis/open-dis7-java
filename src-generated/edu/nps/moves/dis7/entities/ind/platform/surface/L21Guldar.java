package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@331acdad
 * Country: India (IND)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 23175
 */
public class L21Guldar extends EntityType
{
    public L21Guldar()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 23170, Tank Landing Ship
        setSubCategory((byte)1); // uid 23171, Polnochny class
        setSpecific((byte)4); // uid 23175, L21 Guldar
    }
}
