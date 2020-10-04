package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3453acd2
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28519
 */
public class SterlingActerrawHiWayE2500SpreaderandSnowPlow extends EntityType
{
    public SterlingActerrawHiWayE2500SpreaderandSnowPlow()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 26009, Construction Specialty Vehicle
        setSubCategory((byte)24); // uid 28517, Dump Truck, Other
        setSpecific((byte)1); // uid 28518, Sterling Acterra
        setExtra((byte)1); // uid 28519, Sterling Acterra w/ Hi-Way E2500 Spreader and Snow Plow
    }
}
