package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6fa02932
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 11992
 */
public class MCS12Inchon extends EntityType
{
    public MCS12Inchon()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 11968, Amphibious Assault Ship
        setSubCategory((byte)4); // uid 11991, MCS Class
        setSpecific((byte)1); // uid 11992, MCS 12 Inchon
    }
}
