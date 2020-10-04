package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3127cb44
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 10446
 */
public class M927Truck5ton6x6CargoXLWBwowinch extends EntityType
{
    public M927Truck5ton6x6CargoXLWBwowinch()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)5); // uid 10435, M939 6X6 5-ton cargo truck
        setSpecific((byte)11); // uid 10446, M927 - Truck, 5-ton, 6x6, Cargo, XLWB w/o winch
    }
}