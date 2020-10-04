package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1c8f6c66
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 11444
 */
public class DDG906HueiYangexEnglishDDG696Taiwan extends EntityType
{
    public DDG906HueiYangexEnglishDDG696Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 11372, Guided Missile Destroyer
        setSubCategory((byte)6); // uid 11443, Fletcher and Allen M Summer Class
        setSpecific((byte)1); // uid 11444, DDG 906 Huei Yang (ex. English DDG 696) (Taiwan)
    }
}