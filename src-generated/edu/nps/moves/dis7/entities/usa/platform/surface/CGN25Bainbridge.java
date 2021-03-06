package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78a8978a;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11365
 */
public class CGN25Bainbridge extends EntityType
{
    /** Default constructor */
    public CGN25Bainbridge()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)3); // uid 11323, Guided Missile Cruiser
        setSubCategory((byte)6); // uid 11364, Bainbridge Class
        setSpecific((byte)1); // uid 11365, CGN 25 Bainbridge
    }
}
