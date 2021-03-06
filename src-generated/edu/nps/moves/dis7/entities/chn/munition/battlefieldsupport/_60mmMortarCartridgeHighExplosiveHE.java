package edu.nps.moves.dis7.entities.chn.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ce25e47;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 27430
 */
public class _60mmMortarCartridgeHighExplosiveHE extends EntityType
{
    /** Default constructor */
    public _60mmMortarCartridgeHighExplosiveHE()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21465, Ballistic
        setSubCategory((byte)25); // uid 27429, 60mm Mortar Cartridge
        setSpecific((byte)1); // uid 27430, 60mm Mortar Cartridge High Explosive (HE)
    }
}
