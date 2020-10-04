package edu.nps.moves.dis7.entities.kor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4a3e3e8b
 * Country: Korea (Republic of) (KOR)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 25282
 */
public class HawkerRaytheonRC800 extends EntityType
{
    public HawkerRaytheonRC800()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 25281, Reconnaissance
        setSubCategory((byte)1); // uid 25282, Hawker/Raytheon RC-800
    }
}
