package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3c46dcbe;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 14498
 */
public class KapitanSorokinclassicebreakers extends EntityType
{
    /** Default constructor */
    public KapitanSorokinclassicebreakers()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 14477, Auxiliary, Merchant Marine
        setSubCategory((byte)5); // uid 14498, Kapitan Sorokin class (ice breakers)
    }
}
