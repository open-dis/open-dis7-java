package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@650aa077;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29845
 */
public class RaymondEvansWPC1110 extends EntityType
{
    /** Default constructor */
    public RaymondEvansWPC1110()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 12104, Coast Guard Cutters
        setSubCategory((byte)10); // uid 28459, Sentinel Class (WPC)
        setSpecific((byte)10); // uid 29845, Raymond Evans (WPC-1110)
    }
}
