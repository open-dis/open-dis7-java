package edu.nps.moves.dis7.entities.rus.munition.antiradar;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@54895681;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_RADAR;
 *
 * Entity type uid: 20513
 */
public class AS11Kilter extends EntityType
{
    /** Default constructor */
    public AS11Kilter()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_RADAR));

        setCategory((byte)1); // uid 20509, Guided
        setSubCategory((byte)4); // uid 20513, AS-11 Kilter
    }
}
