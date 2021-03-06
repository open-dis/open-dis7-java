package edu.nps.moves.dis7.entities.swe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@1e0895f5;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 17492
 */
public class FighterAirDefense extends EntityType
{
    /** Default constructor */
    public FighterAirDefense()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 17492, Fighter/Air Defense
    }
}
