package edu.nps.moves.dis7.entities.tuv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@623ebac7
 * Country: Tuvalu (TUV)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 26725
 */
public class TeMataili extends EntityType
{
    public TeMataili()
    {
        setCountry(Country.TUVALU_TUV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26723, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26724, Pacific Class Patrol Boat
        setSpecific((byte)1); // uid 26725, Te Mataili
    }
}
