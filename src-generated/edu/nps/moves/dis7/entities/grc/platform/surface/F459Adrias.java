package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@53941c2f
 * Country: Greece (GRC)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 23377
 */
public class F459Adrias extends EntityType
{
    public F459Adrias()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23348, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 23374, Elli Class (Kortenaer Class)
        setSpecific((byte)3); // uid 23377, F459 Adrias
    }
}
