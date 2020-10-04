package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@402c4085
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 16015
 */
public class L9021Ouragan extends EntityType
{
    public L9021Ouragan()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 16011, Dock Landing Ship
        setSubCategory((byte)2); // uid 16014, Ouragan class (TCDs)
        setSpecific((byte)1); // uid 16015, L 9021 Ouragan
    }
}