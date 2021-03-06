package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@503d687a;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15754
 */
public class Mirage2000BGM extends EntityType
{
    /** Default constructor */
    public Mirage2000BGM()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 15720, Fighter/Air Defense
        setSubCategory((byte)4); // uid 15752, Mirage 2000
        setSpecific((byte)2); // uid 15754, Mirage 2000BGM
    }
}
