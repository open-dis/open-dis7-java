package edu.nps.moves.dis7.entities.fra.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@124eb83d
 * Country: France (FRA)
 * Entity kind: Munition
 * Domain: BATTLEFIELD_SUPPORT
 *
 * Entity type uid: 21182
 */
public class LU250EGFTbomb extends EntityType
{
    public LU250EGFTbomb()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21159, Ballistic
        setSubCategory((byte)57); // uid 21182, LU 250 EG-FT bomb
    }
}
