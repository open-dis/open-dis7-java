package edu.nps.moves.dis7.entities.ind.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@79ca7bea;
 * Country: India (IND);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 32539
 */
public class Prithvi extends EntityType
{
    /** Default constructor */
    public Prithvi()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32533, Guided
        setSubCategory((byte)8); // uid 32539, Prithvi
    }
}
