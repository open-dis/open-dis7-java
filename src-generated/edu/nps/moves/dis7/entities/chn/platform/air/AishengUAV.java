package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@38364841;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30506
 */
public class AishengUAV extends EntityType
{
    /** Default constructor */
    public AishengUAV()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 29823, Unmanned
        setSubCategory((byte)4); // uid 30506, Aisheng UAV
    }
}
