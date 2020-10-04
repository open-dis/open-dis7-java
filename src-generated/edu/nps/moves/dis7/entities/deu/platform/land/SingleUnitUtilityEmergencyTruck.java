package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6950ed69
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24845
 */
public class SingleUnitUtilityEmergencyTruck extends EntityType
{
    public SingleUnitUtilityEmergencyTruck()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 24845, Single Unit Utility/Emergency Truck
    }
}
