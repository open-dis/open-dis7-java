package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69909c14;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24943
 */
public class CargoTruck25TonwOpenCargoBay extends EntityType
{
    /** Default constructor */
    public CargoTruck25TonwOpenCargoBay()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24926, Single Unit Cargo Truck
        setSubCategory((byte)11); // uid 24942, Cargo Truck, up to 2.5 Ton
        setSpecific((byte)1); // uid 24943, Cargo Truck, 2.5 Ton w/ Open Cargo Bay
    }
}
