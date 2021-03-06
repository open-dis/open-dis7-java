package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2145b572;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30911
 */
public class ZhanYuAITAuxiliaryIntelligenceTrawler extends EntityType
{
    /** Default constructor */
    public ZhanYuAITAuxiliaryIntelligenceTrawler()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)21); // uid 30910, Surveillance Ship
        setSubCategory((byte)1); // uid 30911, Zhan Yu AIT (Auxiliary, Intelligence Trawler)
    }
}
