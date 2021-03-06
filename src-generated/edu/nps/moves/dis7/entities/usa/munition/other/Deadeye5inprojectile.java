package edu.nps.moves.dis7.entities.usa.munition.other;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@42aa1324;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: OTHER;
 *
 * Entity type uid: 19400
 */
public class Deadeye5inprojectile extends EntityType
{
    /** Default constructor */
    public Deadeye5inprojectile()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.OTHER));

        setCategory((byte)1); // uid 19399, Guided
        setSubCategory((byte)1); // uid 19400, Deadeye 5-in. projectile
    }
}
