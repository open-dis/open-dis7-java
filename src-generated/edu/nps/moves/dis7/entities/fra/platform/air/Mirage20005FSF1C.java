package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2e222612;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 33107
 */
public class Mirage20005FSF1C extends EntityType
{
    /** Default constructor */
    public Mirage20005FSF1C()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 15720, Fighter/Air Defense
        setSubCategory((byte)4); // uid 15752, Mirage 2000
        setSpecific((byte)15); // uid 15767, Mirage 2000-5
        setExtra((byte)2); // uid 33107, Mirage 2000-5F SF1-C
    }
}
