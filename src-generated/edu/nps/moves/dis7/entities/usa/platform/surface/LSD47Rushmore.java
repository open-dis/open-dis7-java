package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@251c4280;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11648
 */
public class LSD47Rushmore extends EntityType
{
    /** Default constructor */
    public LSD47Rushmore()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 11640, Dock Landing Ship
        setSubCategory((byte)1); // uid 11641, Whidbey Island Class
        setSpecific((byte)7); // uid 11648, LSD 47 Rushmore
    }
}
