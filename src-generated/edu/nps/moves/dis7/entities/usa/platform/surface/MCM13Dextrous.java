package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@160b4809;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11615
 */
public class MCM13Dextrous extends EntityType
{
    /** Default constructor */
    public MCM13Dextrous()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 11588, Mine countermeasure ship/craft
        setSubCategory((byte)2); // uid 11602, Avenger Class
        setSpecific((byte)13); // uid 11615, MCM 13 Dextrous
    }
}
