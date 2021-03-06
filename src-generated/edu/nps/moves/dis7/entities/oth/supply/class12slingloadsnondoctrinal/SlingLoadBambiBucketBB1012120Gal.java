package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@56478522;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_12_SLING_LOADS_NON_DOCTRINAL;
 *
 * Entity type uid: 30826
 */
public class SlingLoadBambiBucketBB1012120Gal extends EntityType
{
    /** Default constructor */
    public SlingLoadBambiBucketBB1012120Gal()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)4); // uid 30825, Sling Load, Water Bucket
        setSubCategory((byte)1); // uid 30826, Sling Load, Bambi Bucket (BB 1012), 120 Gal
    }
}
