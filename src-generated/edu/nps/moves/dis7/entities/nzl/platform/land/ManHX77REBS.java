package edu.nps.moves.dis7.entities.nzl.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@200606de;
 * Country: New Zealand (NZL);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31943
 */
public class ManHX77REBS extends EntityType
{
    /** Default constructor */
    public ManHX77REBS()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 31941, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 31942, MAN HX77 - 8x8 (NZ)
        setSpecific((byte)1); // uid 31943, Man HX77 (REBS)
    }
}
