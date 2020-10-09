package edu.nps.moves.dis7.entities.irn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@39a8312f
 * Country: Iran (Islamic Republic of) (IRN)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 31133
 */
public class McDonnellDouglasF4PhantomII extends EntityType
{
    public McDonnellDouglasF4PhantomII()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 30039, Attack/Strike
        setSubCategory((byte)3); // uid 31133, McDonnell-Douglas F-4 Phantom II
    }
}
