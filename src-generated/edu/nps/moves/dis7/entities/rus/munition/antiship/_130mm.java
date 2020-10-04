package edu.nps.moves.dis7.entities.rus.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@35ac9ebd
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_SHIP
 *
 * Entity type uid: 20601
 */
public class _130mm extends EntityType
{
    public _130mm()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)2); // uid 20589, Ballistic
        setSubCategory((byte)10); // uid 20601, 130 mm
    }
}
