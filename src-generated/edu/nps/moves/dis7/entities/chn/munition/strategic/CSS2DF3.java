package edu.nps.moves.dis7.entities.chn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@50ec4bfc;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 21558
 */
public class CSS2DF3 extends EntityType
{
    /** Default constructor */
    public CSS2DF3()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21556, Guided
        setSubCategory((byte)2); // uid 21558, CSS-2 (DF-3)
    }
}
