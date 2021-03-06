package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@23ed382c;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28331
 */
public class BorderPatrolJeepWrangler extends EntityType
{
    /** Default constructor */
    public BorderPatrolJeepWrangler()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 24960, Utility/Emergency Car
        setSubCategory((byte)2); // uid 28324, Police Car
        setSpecific((byte)4); // uid 28330, Police Car, Jeep Wrangler
        setExtra((byte)1); // uid 28331, Border Patrol, Jeep Wrangler
    }
}
