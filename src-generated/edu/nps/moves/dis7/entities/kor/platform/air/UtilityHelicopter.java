package edu.nps.moves.dis7.entities.kor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5fd62371;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 17629
 */
public class UtilityHelicopter extends EntityType
{
    /** Default constructor */
    public UtilityHelicopter()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 17629, Utility Helicopter
    }
}
