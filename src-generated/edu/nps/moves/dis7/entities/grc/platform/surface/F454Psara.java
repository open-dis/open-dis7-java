package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58326051;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23352
 */
public class F454Psara extends EntityType
{
    /** Default constructor */
    public F454Psara()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23348, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23349, Hydra class
        setSpecific((byte)3); // uid 23352, F454 Psara
    }
}
