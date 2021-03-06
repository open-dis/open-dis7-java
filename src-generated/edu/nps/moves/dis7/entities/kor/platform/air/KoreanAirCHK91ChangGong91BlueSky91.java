package edu.nps.moves.dis7.entities.kor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c345c5f;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23871
 */
public class KoreanAirCHK91ChangGong91BlueSky91 extends EntityType
{
    /** Default constructor */
    public KoreanAirCHK91ChangGong91BlueSky91()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 23869, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 23870, Single Piston Engine
        setSpecific((byte)1); // uid 23871, Korean Air CHK-91 Chang-Gong 91 (Blue Sky 91)
    }
}
