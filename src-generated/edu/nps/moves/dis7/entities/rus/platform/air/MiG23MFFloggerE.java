package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69c93ca4
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 13213
 */
public class MiG23MFFloggerE extends EntityType
{
    public MiG23MFFloggerE()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 13174, Fighter/Air Defense
        setSubCategory((byte)5); // uid 13208, MiG-23/24 Flogger
        setSpecific((byte)5); // uid 13213, MiG-23MF Flogger E
    }
}
