package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25953be6;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23414
 */
public class LHD8MakinIsland extends EntityType
{
    /** Default constructor */
    public LHD8MakinIsland()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 11968, Amphibious Assault Ship
        setSubCategory((byte)3); // uid 11983, Wasp Class
        setSpecific((byte)8); // uid 23414, LHD 8 Makin Island
    }
}
