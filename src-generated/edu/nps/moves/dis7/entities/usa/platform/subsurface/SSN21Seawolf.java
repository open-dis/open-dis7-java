package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@443cdaa4;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 12303
 */
public class SSN21Seawolf extends EntityType
{
    /** Default constructor */
    public SSN21Seawolf()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 12301, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)1); // uid 12302, Seawolf class
        setSpecific((byte)1); // uid 12303, SSN 21 Seawolf
    }
}
