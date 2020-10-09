package edu.nps.moves.dis7.entities.fra.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@17ec335a
 * Country: France (FRA)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 21198
 */
public class M20SLBM extends EntityType
{
    public M20SLBM()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21195, Guided
        setSubCategory((byte)3); // uid 21198, M20 SLBM
    }
}
