package edu.nps.moves.dis7.entities.irn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78116659;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 32483
 */
public class Shahab3Mod3BSpentBooster extends EntityType
{
    /** Default constructor */
    public Shahab3Mod3BSpentBooster()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32473, Guided
        setSubCategory((byte)55); // uid 32481, Shahab 3 Mod-3B
        setSpecific((byte)3); // uid 32483, Shahab 3 Mod-3B Spent Booster
    }
}
