package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@51bde877
 * Country: Other
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24832
 */
public class GenericDeliveryTruckBox extends EntityType
{
    public GenericDeliveryTruckBox()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24831, Single Unit Cargo Truck
        setSubCategory((byte)101); // uid 24832, Generic Delivery Truck, Box
    }
}
