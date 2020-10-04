package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@26275b46
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 20303
 */
public class AA2Atoll extends EntityType
{
    public AA2Atoll()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 20301, Guided
        setSubCategory((byte)2); // uid 20303, AA-2 Atoll
    }
}