package edu.nps.moves.dis7.entities.chn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2dd178f3;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 32424
 */
public class CSS5Mod4Stage2Booster extends EntityType
{
    /** Default constructor */
    public CSS5Mod4Stage2Booster()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32412, Guided
        setSubCategory((byte)3); // uid 32420, CSS-5 Mod-4 (DF-21C)
        setSpecific((byte)4); // uid 32424, CSS-5 Mod-4 Stage 2 Booster
    }
}
