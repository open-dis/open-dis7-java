package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@32d22650
 * Country: United States of America (USA)
 * Entity kind: Expendable
 * Domain: AIR
 *
 * Entity type uid: 30015
 */
public class MJU20Flare extends EntityType
{
    public MJU20Flare()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22242, Flare
        setSubCategory((byte)33); // uid 30015, MJU-20 Flare
    }
}
