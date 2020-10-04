package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@11531931
 * Country: Australia (AUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17558
 */
public class TeKukupaCookIslands extends EntityType
{
    public TeKukupaCookIslands()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17524, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17542, Pacific Class Patrol Boat
        setSpecific((byte)16); // uid 17558, Te Kukupa (Cook Islands)
    }
}
