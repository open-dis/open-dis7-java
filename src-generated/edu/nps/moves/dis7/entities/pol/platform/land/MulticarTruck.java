package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7b22ec89
 * Country: Poland (POL)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 29478
 */
public class MulticarTruck extends EntityType
{
    public MulticarTruck()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 29477, Small Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 29478, Multicar Truck
    }
}
