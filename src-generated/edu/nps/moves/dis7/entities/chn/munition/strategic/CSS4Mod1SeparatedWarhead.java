package edu.nps.moves.dis7.entities.chn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3f6cce7f
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 32769
 */
public class CSS4Mod1SeparatedWarhead extends EntityType
{
    public CSS4Mod1SeparatedWarhead()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21556, Guided
        setSubCategory((byte)35); // uid 32767, CSS-4 Mod-1 (DF-5)
        setSpecific((byte)3); // uid 32769, CSS-4 Mod-1 Separated Warhead
    }
}
