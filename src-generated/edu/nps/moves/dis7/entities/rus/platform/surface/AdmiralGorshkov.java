package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@20095ab4;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13503
 */
public class AdmiralGorshkov extends EntityType
{
    /** Default constructor */
    public AdmiralGorshkov()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 13496, Carrier
        setSubCategory((byte)4); // uid 13502, Modified Kiev class (CV)
        setSpecific((byte)1); // uid 13503, Admiral Gorshkov
    }
}
