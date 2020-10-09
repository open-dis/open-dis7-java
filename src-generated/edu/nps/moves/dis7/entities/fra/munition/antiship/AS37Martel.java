package edu.nps.moves.dis7.entities.fra.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@236c098
 * Country: France (FRA)
 * Entity kind: Munition
 * Domain: ANTI_SHIP
 *
 * Entity type uid: 21098
 */
public class AS37Martel extends EntityType
{
    public AS37Martel()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21088, Guided
        setSubCategory((byte)6); // uid 21098, AS-37 Martel
    }
}
