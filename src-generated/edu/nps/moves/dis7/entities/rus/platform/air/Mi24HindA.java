package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7573e12f;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13411
 */
public class Mi24HindA extends EntityType
{
    /** Default constructor */
    public Mi24HindA()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 13407, Attack helicopter
        setSubCategory((byte)2); // uid 13410, Mi-24/25/35 Hind
        setSpecific((byte)1); // uid 13411, Mi-24 Hind A
    }
}
