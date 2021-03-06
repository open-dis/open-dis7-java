package edu.nps.moves.dis7.entities.swe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ee5b2d9;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 27636
 */
public class S102BKorpen extends EntityType
{
    /** Default constructor */
    public S102BKorpen()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 27634, Reconnaissance
        setSubCategory((byte)1); // uid 27635, Gulfstream IV SIGINT
        setSpecific((byte)1); // uid 27636, S 102B Korpen
    }
}
