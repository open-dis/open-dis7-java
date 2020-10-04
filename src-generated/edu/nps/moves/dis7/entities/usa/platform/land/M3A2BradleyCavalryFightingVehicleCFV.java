package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d4e13e1
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 10070
 */
public class M3A2BradleyCavalryFightingVehicleCFV extends EntityType
{
    public M3A2BradleyCavalryFightingVehicleCFV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 10068, FMC M2/M3 Bradley
        setSpecific((byte)2); // uid 10070, M3A2 Bradley Cavalry Fighting Vehicle (CFV)
    }
}