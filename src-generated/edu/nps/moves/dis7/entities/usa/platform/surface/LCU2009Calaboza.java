package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@8e25d3f;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28929
 */
public class LCU2009Calaboza extends EntityType
{
    /** Default constructor */
    public LCU2009Calaboza()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 11685, Landing Craft
        setSubCategory((byte)11); // uid 23692, Landing Craft Utility, LCU-2000, Runnymede Class
        setSpecific((byte)9); // uid 28929, LCU 2009 Calaboza
    }
}
