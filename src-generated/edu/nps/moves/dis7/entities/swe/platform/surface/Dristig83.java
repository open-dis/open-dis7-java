package edu.nps.moves.dis7.entities.swe.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c77ba8f
 * Country: Sweden (SWE)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 26820
 */
public class Dristig83 extends EntityType
{
    public Dristig83()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17500, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26817, Tapper Class
        setSpecific((byte)3); // uid 26820, Dristig (83)
    }
}
