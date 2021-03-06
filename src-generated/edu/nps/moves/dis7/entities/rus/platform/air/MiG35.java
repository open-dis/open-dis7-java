package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1e9804b9;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28628
 */
public class MiG35 extends EntityType
{
    /** Default constructor */
    public MiG35()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 13174, Fighter/Air Defense
        setSubCategory((byte)18); // uid 28628, MiG-35
    }
}
