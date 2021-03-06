package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51b1a8f6;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13412
 */
public class Mi24HindB extends EntityType
{
    /** Default constructor */
    public Mi24HindB()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 13407, Attack helicopter
        setSubCategory((byte)2); // uid 13410, Mi-24/25/35 Hind
        setSpecific((byte)2); // uid 13412, Mi-24 Hind B
    }
}
