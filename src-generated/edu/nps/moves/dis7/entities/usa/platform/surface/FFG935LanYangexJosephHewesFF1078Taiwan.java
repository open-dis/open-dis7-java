package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a070cf0;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11567
 */
public class FFG935LanYangexJosephHewesFF1078Taiwan extends EntityType
{
    /** Default constructor */
    public FFG935LanYangexJosephHewesFF1078Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 11498, Guided Missile Frigate
        setSubCategory((byte)2); // uid 11563, Knox Class
        setSpecific((byte)4); // uid 11567, FFG 935 Lan Yang (ex. Joseph Hewes FF 1078) (Taiwan)
    }
}
