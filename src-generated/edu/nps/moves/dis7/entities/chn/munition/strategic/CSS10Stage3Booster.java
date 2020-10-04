package edu.nps.moves.dis7.entities.chn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d0cd23c
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 32777
 */
public class CSS10Stage3Booster extends EntityType
{
    public CSS10Stage3Booster()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21556, Guided
        setSubCategory((byte)6); // uid 21569, CSS-10 (DF-31)
        setSpecific((byte)7); // uid 32777, CSS-10 Stage 3 Booster
    }
}
