package edu.nps.moves.dis7.entities.chn.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@482c351d;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 28978
 */
public class PL10PLASR extends EntityType
{
    /** Default constructor */
    public PL10PLASR()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21308, Guided
        setSubCategory((byte)21); // uid 28978, PL-10 / PL-ASR
    }
}
