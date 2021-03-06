package edu.nps.moves.dis7.entities.chn.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4168f3d9;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 23992
 */
public class HJ8ARedArrow8A extends EntityType
{
    /** Default constructor */
    public HJ8ARedArrow8A()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 21353, Guided
        setSubCategory((byte)2); // uid 21355, HJ-8 (TOW/Milan type)
        setSpecific((byte)1); // uid 23992, HJ-8A, Red Arrow-8A
    }
}
