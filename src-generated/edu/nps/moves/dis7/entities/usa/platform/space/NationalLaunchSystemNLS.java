package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1f884bd6;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 12418
 */
public class NationalLaunchSystemNLS extends EntityType
{
    /** Default constructor */
    public NationalLaunchSystemNLS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)0); // uid 12416, Other
        setSubCategory((byte)2); // uid 12418, National Launch System (NLS)
    }
}
