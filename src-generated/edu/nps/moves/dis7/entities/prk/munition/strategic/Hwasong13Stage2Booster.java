package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d874695;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32835
 */
public class Hwasong13Stage2Booster extends EntityType
{
    /** Default constructor */
    public Hwasong13Stage2Booster()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)47); // uid 32831, Hwasong 13 (2-stage version)
        setSpecific((byte)4); // uid 32835, Hwasong 13 Stage 2 Booster
    }
}
