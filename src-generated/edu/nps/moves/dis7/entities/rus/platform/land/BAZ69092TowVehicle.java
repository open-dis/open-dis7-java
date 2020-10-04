package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@27aae97b
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 25721
 */
public class BAZ69092TowVehicle extends EntityType
{
    public BAZ69092TowVehicle()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)41); // uid 25721, BAZ-69092 Tow Vehicle
    }
}
