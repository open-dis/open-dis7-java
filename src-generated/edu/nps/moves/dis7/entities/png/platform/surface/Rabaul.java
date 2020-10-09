package edu.nps.moves.dis7.entities.png.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@288a4658
 * Country: Papua New Guinea (PNG)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 26741
 */
public class Rabaul extends EntityType
{
    public Rabaul()
    {
        setCountry(Country.PAPUA_NEW_GUINEA_PNG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26739, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26740, Pacific Class Patrol Boat
        setSpecific((byte)1); // uid 26741, Rabaul
    }
}
