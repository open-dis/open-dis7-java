package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@eb21112;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31982
 */
public class Type09PLL09122mm8x8ModularSelfPropelledHowitzerSystem extends EntityType
{
    /** Default constructor */
    public Type09PLL09122mm8x8ModularSelfPropelledHowitzerSystem()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)39); // uid 31982, Type 09 (PLL-09) 122mm 8x8 Modular Self-Propelled Howitzer System
    }
}
