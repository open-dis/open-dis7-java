package edu.nps.moves.dis7.entities.wsm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@60859f5a;
 * Country: Samoa (WSM);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26733
 */
public class Nafanua extends EntityType
{
    /** Default constructor */
    public Nafanua()
    {
        setCountry(Country.SAMOA_WSM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26731, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26732, Pacific Class Patrol Boat
        setSpecific((byte)1); // uid 26733, Nafanua
    }
}
