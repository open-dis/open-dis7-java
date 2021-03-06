package edu.nps.moves.dis7.entities.irn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24d8f87a;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32496
 */
public class Shahab4Stage1Booster extends EntityType
{
    /** Default constructor */
    public Shahab4Stage1Booster()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21715, Guided
        setSubCategory((byte)22); // uid 32492, Shahab 4
        setSpecific((byte)4); // uid 32496, Shahab 4 Stage 1 Booster
    }
}
