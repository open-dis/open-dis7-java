package edu.nps.moves.dis7.entities.nor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3113a37;
 * Country: Norway (NOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18965
 */
public class Teist extends EntityType
{
    /** Default constructor */
    public Teist()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18957, Light/Patrol Craft
        setSubCategory((byte)2); // uid 18959, Hauk Class
        setSpecific((byte)6); // uid 18965, Teist
    }
}
