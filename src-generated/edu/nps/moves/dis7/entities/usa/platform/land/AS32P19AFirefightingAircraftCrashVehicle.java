package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7327a447;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 33042
 */
public class AS32P19AFirefightingAircraftCrashVehicle extends EntityType
{
    /** Default constructor */
    public AS32P19AFirefightingAircraftCrashVehicle()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)19); // uid 10543, Oshkosh Heavy Expanded Mobility Tactical Truck (HEMTT) 8x8 9979-kg
        setSpecific((byte)18); // uid 33042, AS32P19A Firefighting Aircraft Crash Vehicle
    }
}
