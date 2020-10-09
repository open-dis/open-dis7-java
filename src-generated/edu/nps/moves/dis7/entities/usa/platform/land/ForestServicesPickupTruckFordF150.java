package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3b353651
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28322
 */
public class ForestServicesPickupTruckFordF150 extends EntityType
{
    public ForestServicesPickupTruckFordF150()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 24952, Single Unit Utility/Emergency Truck
        setSubCategory((byte)23); // uid 24953, Police, Pickup Truck
        setSpecific((byte)1); // uid 24954, Police Pickup Truck, Ford F-150
        setExtra((byte)2); // uid 28322, Forest Services Pickup Truck, Ford F-150
    }
}
