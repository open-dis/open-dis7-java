package edu.nps.moves.dis7.entities.chn.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b1b471;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 30572
 */
public class DF10A extends EntityType
{
    /** Default constructor */
    public DF10A()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 21448, Guided
        setSubCategory((byte)17); // uid 29142, CJ-10/DH-10
        setSpecific((byte)2); // uid 30572, DF-10A
    }
}
