package edu.nps.moves.dis7.entities.oth.supply.class11suppliesnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@78d6c244;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_11_SUPPLIES_NON_DOCTRINAL;
 *
 * Entity type uid: 30604
 */
public class FuelDrumFabricCollapsible500gal extends EntityType
{
    /** Default constructor */
    public FuelDrumFabricCollapsible500gal()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_11_SUPPLIES_NON_DOCTRINAL));

        setCategory((byte)3); // uid 30601, Fuel Tanks, Drums and Bladders
        setSubCategory((byte)3); // uid 30604, Fuel Drum, Fabric Collapsible, 500 gal
    }
}
