package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3ac3fd8b
 * Country: Australia (AUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 29580
 */
public class CapeClassPatrolBoat extends EntityType
{
    public CapeClassPatrolBoat()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17524, Light/Patrol Craft
        setSubCategory((byte)5); // uid 29580, Cape Class Patrol Boat
    }
}
