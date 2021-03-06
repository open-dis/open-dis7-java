package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3930015a;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17555
 */
public class TeMatailiTuvalu extends EntityType
{
    /** Default constructor */
    public TeMatailiTuvalu()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17524, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17542, Pacific Class Patrol Boat
        setSpecific((byte)13); // uid 17555, Te Mataili (Tuvalu)
    }
}
