package edu.nps.moves.dis7.entities.isr.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@56fda064;
 * Country: Israel (ISR);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 29023
 */
public class Arrow3 extends EntityType
{
    /** Default constructor */
    public Arrow3()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21282, Guided
        setSubCategory((byte)6); // uid 29016, Arrow / Hetz
        setSpecific((byte)7); // uid 29023, Arrow 3
    }
}
