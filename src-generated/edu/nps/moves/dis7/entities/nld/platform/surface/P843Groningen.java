package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5bd1ceca
 * Country: Netherlands (NLD)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27758
 */
public class P843Groningen extends EntityType
{
    public P843Groningen()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27753, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27754, Holland Class
        setSpecific((byte)4); // uid 27758, P843 Groningen
    }
}
