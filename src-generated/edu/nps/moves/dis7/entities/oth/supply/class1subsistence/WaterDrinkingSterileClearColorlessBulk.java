package edu.nps.moves.dis7.entities.oth.supply.class1subsistence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4d825dbe
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_1_SUBSISTENCE
 *
 * Entity type uid: 30656
 */
public class WaterDrinkingSterileClearColorlessBulk extends EntityType
{
    public WaterDrinkingSterileClearColorlessBulk()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_1_SUBSISTENCE));

        setCategory((byte)6); // uid 30655, W - Water
        setSubCategory((byte)1); // uid 30656, Water, Drinking, Sterile, Clear Colorless (Bulk)
    }
}
