package edu.nps.moves.dis7.entities.aut.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3551a94
 * Country: Austria (AUT)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24132
 */
public class LargeWheeledUtilityVehiclegreaterthan125tons extends EntityType
{
    public LargeWheeledUtilityVehiclegreaterthan125tons()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 24132, Large Wheeled Utility Vehicle - (greater than 1.25 tons)
    }
}
