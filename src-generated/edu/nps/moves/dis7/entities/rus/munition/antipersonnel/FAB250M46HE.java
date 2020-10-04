package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@532dacf5
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_PERSONNEL
 *
 * Entity type uid: 20672
 */
public class FAB250M46HE extends EntityType
{
    public FAB250M46HE()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 20637, Ballistic
        setSubCategory((byte)27); // uid 20672, FAB-250 M46 HE
    }
}
