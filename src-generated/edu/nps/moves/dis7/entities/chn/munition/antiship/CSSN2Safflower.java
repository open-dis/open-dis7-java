package edu.nps.moves.dis7.entities.chn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@39023dbf;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21422
 */
public class CSSN2Safflower extends EntityType
{
    /** Default constructor */
    public CSSN2Safflower()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21409, Guided
        setSubCategory((byte)8); // uid 21419, HY-1
        setSpecific((byte)3); // uid 21422, CSS-N-2 Safflower
    }
}
