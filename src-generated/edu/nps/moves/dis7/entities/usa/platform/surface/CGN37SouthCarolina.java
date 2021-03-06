package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f4596d0;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11359
 */
public class CGN37SouthCarolina extends EntityType
{
    /** Default constructor */
    public CGN37SouthCarolina()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)3); // uid 11323, Guided Missile Cruiser
        setSubCategory((byte)3); // uid 11357, California Class
        setSpecific((byte)2); // uid 11359, CGN 37 South Carolina
    }
}
