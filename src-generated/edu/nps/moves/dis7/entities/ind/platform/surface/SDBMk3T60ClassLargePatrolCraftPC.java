package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3f270e0a
 * Country: India (IND)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18840
 */
public class SDBMk3T60ClassLargePatrolCraftPC extends EntityType
{
    public SDBMk3T60ClassLargePatrolCraftPC()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18833, Light/Patrol Craft(PC)
        setSubCategory((byte)5); // uid 18840, SDB Mk 3/T 60 Class (Large Patrol Craft) (PC)
    }
}
