package edu.nps.moves.dis7.entities.isr.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2e0ad709
 * Country: Israel (ISR)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 21283
 */
public class Shafrir2 extends EntityType
{
    public Shafrir2()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21282, Guided
        setSubCategory((byte)1); // uid 21283, Shafrir 2
    }
}
