package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@54afd745;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27474
 */
public class F832AbrahamvanderHulst extends EntityType
{
    /** Default constructor */
    public F832AbrahamvanderHulst()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18938, Guided Missile Frigate (FFG)
        setSubCategory((byte)6); // uid 27468, Karel Doorman Class
        setSpecific((byte)6); // uid 27474, F832 Abraham van der Hulst
    }
}
