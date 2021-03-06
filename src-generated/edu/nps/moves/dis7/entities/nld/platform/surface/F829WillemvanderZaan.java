package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d6bc158;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27471
 */
public class F829WillemvanderZaan extends EntityType
{
    /** Default constructor */
    public F829WillemvanderZaan()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18938, Guided Missile Frigate (FFG)
        setSubCategory((byte)6); // uid 27468, Karel Doorman Class
        setSpecific((byte)3); // uid 27471, F829 Willem van der Zaan
    }
}
