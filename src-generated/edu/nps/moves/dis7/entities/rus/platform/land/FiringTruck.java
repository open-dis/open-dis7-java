package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43cf6ea3
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 12876
 */
public class FiringTruck extends EntityType
{
    public FiringTruck()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)4); // uid 12871, ZIL-131 6x6 3500-kg truck
        setSpecific((byte)5); // uid 12876, Firing Truck
    }
}
