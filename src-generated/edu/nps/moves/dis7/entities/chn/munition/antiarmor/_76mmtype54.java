package edu.nps.moves.dis7.entities.chn.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@a0c5be;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 21358
 */
public class _76mmtype54 extends EntityType
{
    /** Default constructor */
    public _76mmtype54()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21356, Ballistic
        setSubCategory((byte)2); // uid 21358, 76 mm type 54
    }
}
