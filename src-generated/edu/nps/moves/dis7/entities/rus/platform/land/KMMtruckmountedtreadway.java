package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@39aa45a1;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12485
 */
public class KMMtruckmountedtreadway extends EntityType
{
    /** Default constructor */
    public KMMtruckmountedtreadway()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)0); // uid 12477, Other
        setSubCategory((byte)1); // uid 12478, Bridges
        setSpecific((byte)7); // uid 12485, KMM truck-mounted treadway
    }
}
