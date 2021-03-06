package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@44afefd5;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12957
 */
public class MDK2Mtrenchdiggingmachine extends EntityType
{
    /** Default constructor */
    public MDK2Mtrenchdiggingmachine()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 12944, Large Tracked Utility Vehicle
        setSubCategory((byte)13); // uid 12957, MDK-2M trench-digging machine
    }
}
