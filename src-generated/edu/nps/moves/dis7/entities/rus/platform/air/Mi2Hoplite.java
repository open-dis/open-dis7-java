package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4349754;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13458
 */
public class Mi2Hoplite extends EntityType
{
    /** Default constructor */
    public Mi2Hoplite()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 13431, Utility helicopter
        setSubCategory((byte)5); // uid 13458, Mi-2 Hoplite
    }
}
