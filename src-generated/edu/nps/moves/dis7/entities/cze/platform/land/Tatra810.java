package edu.nps.moves.dis7.entities.cze.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3febb011;
 * Country: Czech Republic (CZE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30082
 */
public class Tatra810 extends EntityType
{
    /** Default constructor */
    public Tatra810()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 30081, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 30082, Tatra 810
    }
}
