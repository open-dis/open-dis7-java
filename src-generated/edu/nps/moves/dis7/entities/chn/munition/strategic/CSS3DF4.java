package edu.nps.moves.dis7.entities.chn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2801827a
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 21559
 */
public class CSS3DF4 extends EntityType
{
    public CSS3DF4()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21556, Guided
        setSubCategory((byte)3); // uid 21559, CSS-3 (DF-4)
    }
}
