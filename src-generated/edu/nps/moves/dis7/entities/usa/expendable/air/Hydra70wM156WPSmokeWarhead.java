package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@534d0e20;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 24988
 */
public class Hydra70wM156WPSmokeWarhead extends EntityType
{
    /** Default constructor */
    public Hydra70wM156WPSmokeWarhead()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 24983, Smoke Generator
        setSubCategory((byte)2); // uid 24987, Target/Spot Marker
        setSpecific((byte)1); // uid 24988, Hydra 70 w/ M156 WP Smoke Warhead
    }
}
