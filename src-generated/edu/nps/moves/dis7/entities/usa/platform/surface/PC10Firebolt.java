package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@401c4250
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 11584
 */
public class PC10Firebolt extends EntityType
{
    public PC10Firebolt()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 11573, Light/patrol craft
        setSubCategory((byte)1); // uid 11574, PC Class
        setSpecific((byte)10); // uid 11584, PC 10 Firebolt
    }
}
