package edu.nps.moves.dis7.entities.chn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9e02f84;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21417
 */
public class CSSC1Bmod12CoastalDefensemissile extends EntityType
{
    /** Default constructor */
    public CSSC1Bmod12CoastalDefensemissile()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21409, Guided
        setSubCategory((byte)7); // uid 21416, SY-1/FL-1
        setSpecific((byte)1); // uid 21417, CSSC-1B mod 1/2 Coastal Defense missile
    }
}
