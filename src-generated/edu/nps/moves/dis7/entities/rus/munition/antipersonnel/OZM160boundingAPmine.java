package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@147e0734;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 20733
 */
public class OZM160boundingAPmine extends EntityType
{
    /** Default constructor */
    public OZM160boundingAPmine()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 20697, Fixed
        setSubCategory((byte)36); // uid 20733, OZM-160 bounding AP mine
    }
}
