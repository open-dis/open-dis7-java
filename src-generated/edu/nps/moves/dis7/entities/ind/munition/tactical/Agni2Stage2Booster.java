package edu.nps.moves.dis7.entities.ind.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2017f6e6;
 * Country: India (IND);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 32538
 */
public class Agni2Stage2Booster extends EntityType
{
    /** Default constructor */
    public Agni2Stage2Booster()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32533, Guided
        setSubCategory((byte)1); // uid 32534, Agni 2
        setSpecific((byte)4); // uid 32538, Agni 2 Stage 2 Booster
    }
}
