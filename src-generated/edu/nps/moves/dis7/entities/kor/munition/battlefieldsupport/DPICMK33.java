package edu.nps.moves.dis7.entities.kor.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6ddc67d0
 * Country: Korea (Republic of) (KOR)
 * Entity kind: Munition
 * Domain: BATTLEFIELD_SUPPORT
 *
 * Entity type uid: 27439
 */
public class DPICMK33 extends EntityType
{
    public DPICMK33()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 27436, Ballistic
        setSubCategory((byte)1); // uid 27437, 130mm Rockets (MRL)
        setSpecific((byte)2); // uid 27439, DPICM, K-33
    }
}
