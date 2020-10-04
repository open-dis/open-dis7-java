package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@14457a95
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 20392
 */
public class SA20Gargoyle extends EntityType
{
    public SA20Gargoyle()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 20301, Guided
        setSubCategory((byte)42); // uid 20392, SA-20 Gargoyle
    }
}
