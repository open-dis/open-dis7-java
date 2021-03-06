package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e00bfe2;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 12458
 */
public class WhiteCloud extends EntityType
{
    /** Default constructor */
    public WhiteCloud()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 12431, Unmanned
        setSubCategory((byte)6); // uid 12457, Ocean Surveillance satellite
        setSpecific((byte)1); // uid 12458, White Cloud
    }
}
