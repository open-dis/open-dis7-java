package edu.nps.moves.dis7.entities.usa.munition.antiradar;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3ee6dc82;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_RADAR;
 *
 * Entity type uid: 19683
 */
public class Stinger extends EntityType
{
    /** Default constructor */
    public Stinger()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_RADAR));

        setCategory((byte)1); // uid 19670, Guided
        setSubCategory((byte)6); // uid 19683, Stinger
    }
}
