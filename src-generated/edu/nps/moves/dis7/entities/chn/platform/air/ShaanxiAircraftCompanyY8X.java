package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@32a068d1;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24377
 */
public class ShaanxiAircraftCompanyY8X extends EntityType
{
    /** Default constructor */
    public ShaanxiAircraftCompanyY8X()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 24375, ASW/Patrol/Observation
        setSubCategory((byte)2); // uid 24377, Shaanxi Aircraft Company Y-8X
    }
}
