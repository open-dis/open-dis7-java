package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2e85e3f1;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 30026
 */
public class MJU46Flare extends EntityType
{
    /** Default constructor */
    public MJU46Flare()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22242, Flare
        setSubCategory((byte)39); // uid 30026, MJU-46 Flare
    }
}
