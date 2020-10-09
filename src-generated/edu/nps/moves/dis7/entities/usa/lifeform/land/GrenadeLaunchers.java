package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@45c90a05
 * Country: United States of America (USA)
 * Entity kind: Life form
 * Domain: LAND
 *
 * Entity type uid: 32681
 */
public class GrenadeLaunchers extends EntityType
{
    public GrenadeLaunchers()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32666, U.S. Army (USA)
        setSubCategory((byte)30); // uid 32681, Grenade Launchers
    }
}
