package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2bdb5e0f;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 19498
 */
public class Mk49RAM extends EntityType
{
    /** Default constructor */
    public Mk49RAM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 19406, Guided
        setSubCategory((byte)28); // uid 19498, Mk 49 RAM
    }
}
