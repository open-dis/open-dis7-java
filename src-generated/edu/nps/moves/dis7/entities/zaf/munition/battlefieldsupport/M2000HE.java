package edu.nps.moves.dis7.entities.zaf.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1fc0d9b4;
 * Country: South Africa (ZAF);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 26975
 */
public class M2000HE extends EntityType
{
    /** Default constructor */
    public M2000HE()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 26972, Ballistic
        setSubCategory((byte)1); // uid 26973, 155mm
        setSpecific((byte)1); // uid 26974, Denel, Unassisted, 155mm
        setExtra((byte)1); // uid 26975, M2000 HE
    }
}
