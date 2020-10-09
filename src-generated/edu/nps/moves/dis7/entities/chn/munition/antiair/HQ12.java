package edu.nps.moves.dis7.entities.chn.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e40fbb3
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 29107
 */
public class HQ12 extends EntityType
{
    public HQ12()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21308, Guided
        setSubCategory((byte)23); // uid 29104, KS-1 / HQ-12
        setSpecific((byte)3); // uid 29107, HQ-12
    }
}
