package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d0100ea;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23435
 */
public class RB15AssaultBoat extends EntityType
{
    /** Default constructor */
    public RB15AssaultBoat()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 11573, Light/patrol craft
        setSubCategory((byte)2); // uid 23434, Rubber Boats
        setSpecific((byte)1); // uid 23435, RB-15 Assault Boat
    }
}
