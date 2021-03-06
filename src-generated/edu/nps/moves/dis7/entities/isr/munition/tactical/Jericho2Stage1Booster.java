package edu.nps.moves.dis7.entities.isr.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e495414;
 * Country: Israel (ISR);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 32528
 */
public class Jericho2Stage1Booster extends EntityType
{
    /** Default constructor */
    public Jericho2Stage1Booster()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 29011, Guided
        setSubCategory((byte)3); // uid 32525, Jericho 2
        setSpecific((byte)3); // uid 32528, Jericho 2 Stage 1 Booster
    }
}
