package edu.nps.moves.dis7.entities.oth.supply.class11suppliesnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7645b7d;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_11_SUPPLIES_NON_DOCTRINAL;
 *
 * Entity type uid: 30808
 */
public class DismountedInfantry extends EntityType
{
    /** Default constructor */
    public DismountedInfantry()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_11_SUPPLIES_NON_DOCTRINAL));

        setCategory((byte)1); // uid 30807, Other
        setSubCategory((byte)1); // uid 30808, Dismounted Infantry
    }
}
