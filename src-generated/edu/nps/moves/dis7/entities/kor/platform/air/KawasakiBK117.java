package edu.nps.moves.dis7.entities.kor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@46e8a539;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 17630
 */
public class KawasakiBK117 extends EntityType
{
    /** Default constructor */
    public KawasakiBK117()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 17629, Utility Helicopter
        setSubCategory((byte)1); // uid 17630, Kawasaki BK 117
    }
}
