package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e9804b9
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 29200
 */
public class MiG31BM extends EntityType
{
    public MiG31BM()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 13174, Fighter/Air Defense
        setSubCategory((byte)1); // uid 13175, MiG-31 Foxhound
        setSpecific((byte)3); // uid 29200, MiG-31BM
    }
}