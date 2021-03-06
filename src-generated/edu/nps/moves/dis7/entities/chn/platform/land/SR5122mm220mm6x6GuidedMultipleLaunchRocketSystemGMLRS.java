package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@67b467e9;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31988
 */
public class SR5122mm220mm6x6GuidedMultipleLaunchRocketSystemGMLRS extends EntityType
{
    /** Default constructor */
    public SR5122mm220mm6x6GuidedMultipleLaunchRocketSystemGMLRS()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)45); // uid 31988, SR5 122mm/220mm 6x6 Guided Multiple Launch Rocket System (GMLRS)
    }
}
