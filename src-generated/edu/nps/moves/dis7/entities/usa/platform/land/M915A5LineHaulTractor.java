package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@276cc8dc
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 26662
 */
public class M915A5LineHaulTractor extends EntityType
{
    public M915A5LineHaulTractor()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)8); // uid 10470, M915 Truck, Tractor, Line Haul, 6x4
        setSpecific((byte)8); // uid 26662, M915A5 Line Haul Tractor
    }
}
