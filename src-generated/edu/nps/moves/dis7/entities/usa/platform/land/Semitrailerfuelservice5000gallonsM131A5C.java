package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69d3cf7e;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23468
 */
public class Semitrailerfuelservice5000gallonsM131A5C extends EntityType
{
    /** Default constructor */
    public Semitrailerfuelservice5000gallonsM131A5C()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 10625, Fuel trailer
        setSubCategory((byte)2); // uid 10627, 1001 - 5000 gallons
        setSpecific((byte)2); // uid 23468, Semi-trailer, fuel service, 5000 gallons, M131A5C
    }
}
