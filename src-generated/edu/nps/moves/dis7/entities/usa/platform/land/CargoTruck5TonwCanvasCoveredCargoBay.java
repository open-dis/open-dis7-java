package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58a2d9f9;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24949
 */
public class CargoTruck5TonwCanvasCoveredCargoBay extends EntityType
{
    /** Default constructor */
    public CargoTruck5TonwCanvasCoveredCargoBay()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24926, Single Unit Cargo Truck
        setSubCategory((byte)12); // uid 24946, Cargo Truck, up to 5 Ton
        setSpecific((byte)2); // uid 24949, Cargo Truck, 5 Ton w/ Canvas Covered Cargo Bay
    }
}
