package edu.nps.moves.dis7.entities.grc.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b7c4869;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23403
 */
public class S123Katsonis extends EntityType
{
    /** Default constructor */
    public S123Katsonis()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23390, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 23400, Papanikolis class
        setSpecific((byte)3); // uid 23403, S123 Katsonis
    }
}
