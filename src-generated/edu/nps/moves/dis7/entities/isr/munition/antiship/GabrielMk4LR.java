package edu.nps.moves.dis7.entities.isr.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6cc48a17;
 * Country: Israel (ISR);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21300
 */
public class GabrielMk4LR extends EntityType
{
    /** Default constructor */
    public GabrielMk4LR()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21295, Guided
        setSubCategory((byte)1); // uid 21296, Gabriel
        setSpecific((byte)4); // uid 21300, Gabriel Mk 4 LR
    }
}
