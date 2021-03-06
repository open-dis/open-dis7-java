package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@71178a52;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12954
 */
public class BTMTMGhighspeedditchingmachine extends EntityType
{
    /** Default constructor */
    public BTMTMGhighspeedditchingmachine()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 12944, Large Tracked Utility Vehicle
        setSubCategory((byte)10); // uid 12954, BTM-TMG high-speed ditching machine
    }
}
