package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@622ef26a;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31442
 */
public class GenericRefrigeratedTruckLarge extends EntityType
{
    /** Default constructor */
    public GenericRefrigeratedTruckLarge()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24831, Single Unit Cargo Truck
        setSubCategory((byte)110); // uid 31442, Generic Refrigerated Truck, Large
    }
}
