package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24dd44f9
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 11978
 */
public class LPH7Guadalcanal extends EntityType
{
    public LPH7Guadalcanal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 11968, Amphibious Assault Ship
        setSubCategory((byte)2); // uid 11975, Iwo Jima Class
        setSpecific((byte)3); // uid 11978, LPH 7 Guadalcanal
    }
}
