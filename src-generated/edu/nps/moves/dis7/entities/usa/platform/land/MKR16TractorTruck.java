package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1bf14704;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 33053
 */
public class MKR16TractorTruck extends EntityType
{
    /** Default constructor */
    public MKR16TractorTruck()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)43); // uid 33050, Logistic Vehicle System Replacement (LVSR)
        setSpecific((byte)3); // uid 33053, MKR16 Tractor Truck
    }
}
