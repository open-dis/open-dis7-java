package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1682c08c
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 25639
 */
public class M1152EnhancedCargoTroopCarrier extends EntityType
{
    public M1152EnhancedCargoTroopCarrier()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 10349, High Mobility Multipurpose Wheeled Vehicle (HMMWV) Humvee
        setSpecific((byte)33); // uid 25639, M1152 Enhanced Cargo/Troop Carrier
    }
}
