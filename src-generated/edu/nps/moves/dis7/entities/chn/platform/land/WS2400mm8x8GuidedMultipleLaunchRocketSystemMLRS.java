package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@a74868d;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31960
 */
public class WS2400mm8x8GuidedMultipleLaunchRocketSystemMLRS extends EntityType
{
    /** Default constructor */
    public WS2400mm8x8GuidedMultipleLaunchRocketSystemMLRS()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)27); // uid 31960, WS-2 400mm 8x8 Guided Multiple Launch Rocket System (MLRS)
    }
}
