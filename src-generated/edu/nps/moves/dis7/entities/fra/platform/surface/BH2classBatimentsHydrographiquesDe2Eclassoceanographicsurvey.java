package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7bba5817;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16041
 */
public class BH2classBatimentsHydrographiquesDe2Eclassoceanographicsurvey extends EntityType
{
    /** Default constructor */
    public BH2classBatimentsHydrographiquesDe2Eclassoceanographicsurvey()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 16040, Auxiliary
        setSubCategory((byte)1); // uid 16041, BH2 class (Batiments Hydrographiques De 2E class) (oceanographic & survey)
    }
}
