package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3d97a632
 * Country: Iran (Islamic Republic of) (IRN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 30539
 */
public class KUCHInshorePatrolCraft extends EntityType
{
    public KUCHInshorePatrolCraft()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18046, Light/Patrol Craft
        setSubCategory((byte)26); // uid 30539, KUCH Inshore Patrol Craft
    }
}
