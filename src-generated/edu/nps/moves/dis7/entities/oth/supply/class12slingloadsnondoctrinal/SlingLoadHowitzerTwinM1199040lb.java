package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7769d9b6;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_12_SLING_LOADS_NON_DOCTRINAL;
 *
 * Entity type uid: 30842
 */
public class SlingLoadHowitzerTwinM1199040lb extends EntityType
{
    /** Default constructor */
    public SlingLoadHowitzerTwinM1199040lb()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)6); // uid 30841, Sling Load, Howitzer
        setSubCategory((byte)1); // uid 30842, Sling Load, Howitzer, Twin M119, 9040 lb
    }
}
