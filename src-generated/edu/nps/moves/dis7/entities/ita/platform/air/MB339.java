package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@18cebaa5;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 18308
 */
public class MB339 extends EntityType
{
    /** Default constructor */
    public MB339()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 18305, Fighter/Air Defense
        setSubCategory((byte)2); // uid 18308, MB 339
    }
}
