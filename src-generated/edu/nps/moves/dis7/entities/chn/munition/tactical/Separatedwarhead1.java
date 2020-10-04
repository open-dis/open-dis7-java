package edu.nps.moves.dis7.entities.chn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6b4a4e40
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Munition
 * Domain: TACTICAL
 *
 * Entity type uid: 21585
 */
public class Separatedwarhead1 extends EntityType
{
    public Separatedwarhead1()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)2); // uid 21575, Ballistic
        setSubCategory((byte)2); // uid 21582, M-11 / DF-11 / CSS-7
        setSpecific((byte)3); // uid 21585, Separated warhead
    }
}