package edu.nps.moves.dis7.entities.chn.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6af65f29;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 28977
 */
public class PL11BPL11AMR extends EntityType
{
    /** Default constructor */
    public PL11BPL11AMR()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21308, Guided
        setSubCategory((byte)18); // uid 21334, PL-11
        setSpecific((byte)2); // uid 28977, PL-11B / PL-11 AMR
    }
}
