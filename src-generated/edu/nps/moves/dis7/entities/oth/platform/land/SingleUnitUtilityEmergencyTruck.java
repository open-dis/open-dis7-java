package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@bae47a0;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25837
 */
public class SingleUnitUtilityEmergencyTruck extends EntityType
{
    /** Default constructor */
    public SingleUnitUtilityEmergencyTruck()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 25837, Single Unit Utility/Emergency Truck
    }
}
