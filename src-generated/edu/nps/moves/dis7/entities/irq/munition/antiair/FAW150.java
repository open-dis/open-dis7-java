package edu.nps.moves.dis7.entities.irq.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@19a5b637;
 * Country: Iraq (IRQ);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 21279
 */
public class FAW150 extends EntityType
{
    /** Default constructor */
    public FAW150()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21277, Guided
        setSubCategory((byte)2); // uid 21279, FAW 150
    }
}
