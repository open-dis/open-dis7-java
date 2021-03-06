package edu.nps.moves.dis7.entities.twn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@78054f54;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29224
 */
public class AIDCAT3TzuChung extends EntityType
{
    /** Default constructor */
    public AIDCAT3TzuChung()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 29223, Trainer
        setSubCategory((byte)1); // uid 29224, AIDC AT-3 Tzu Chung
    }
}
