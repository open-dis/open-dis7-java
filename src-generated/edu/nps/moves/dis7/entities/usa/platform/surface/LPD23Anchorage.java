package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35eee641;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24046
 */
public class LPD23Anchorage extends EntityType
{
    /** Default constructor */
    public LPD23Anchorage()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 12000, Amphibious Transport Dock
        setSubCategory((byte)2); // uid 12015, San Antonio Class
        setSpecific((byte)7); // uid 24046, LPD 23 Anchorage
    }
}
