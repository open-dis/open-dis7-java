package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4e25147a;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13312
 */
public class Tu16ABadgerA extends EntityType
{
    /** Default constructor */
    public Tu16ABadgerA()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)3); // uid 13309, Bomber
        setSubCategory((byte)2); // uid 13311, Tu-16 Badger
        setSpecific((byte)1); // uid 13312, Tu-16A Badger A
    }
}
