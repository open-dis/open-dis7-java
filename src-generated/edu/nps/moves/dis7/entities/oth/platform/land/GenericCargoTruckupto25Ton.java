package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@32c0915e;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25825
 */
public class GenericCargoTruckupto25Ton extends EntityType
{
    /** Default constructor */
    public GenericCargoTruckupto25Ton()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24831, Single Unit Cargo Truck
        setSubCategory((byte)11); // uid 25825, Generic Cargo Truck, up to 2.5 Ton
    }
}
