package edu.nps.moves.dis7.entities.fra.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@310d57b1;
 * Country: France (FRA);
 * Entity kind: Munition;
 * Domain: ANTI_SUBMARINE;
 *
 * Entity type uid: 21126
 */
public class Murenetorpedo extends EntityType
{
    /** Default constructor */
    public Murenetorpedo()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 21118, Guided
        setSubCategory((byte)8); // uid 21126, Murene torpedo
    }
}
