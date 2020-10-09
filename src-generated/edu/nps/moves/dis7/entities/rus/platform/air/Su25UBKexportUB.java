package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a344b65
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 13298
 */
public class Su25UBKexportUB extends EntityType
{
    public Su25UBKexportUB()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 13259, Attack/Strike
        setSubCategory((byte)8); // uid 13294, Su-25 Frogfoot
        setSpecific((byte)4); // uid 13298, Su-25UBK (export UB)
    }
}
