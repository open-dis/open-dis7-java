package edu.nps.moves.dis7.entities.chn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5ec9eefa
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Munition
 * Domain: TACTICAL
 *
 * Entity type uid: 32441
 */
public class CSS11SeparatedWarhead extends EntityType
{
    public CSS11SeparatedWarhead()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32412, Guided
        setSubCategory((byte)8); // uid 32440, CSS-11 (DF-16)
        setSpecific((byte)2); // uid 32441, CSS-11 Separated Warhead
    }
}
