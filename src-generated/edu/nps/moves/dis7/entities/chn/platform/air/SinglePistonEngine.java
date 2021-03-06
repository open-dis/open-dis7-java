package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1e9e725a;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24743
 */
public class SinglePistonEngine extends EntityType
{
    /** Default constructor */
    public SinglePistonEngine()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 23852, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 24743, Single Piston Engine
    }
}
