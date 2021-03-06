package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3fdcde7a;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 12110
 */
public class HamiltonWHEC715 extends EntityType
{
    /** Default constructor */
    public HamiltonWHEC715()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 12104, Coast Guard Cutters
        setSubCategory((byte)1); // uid 12105, 378-foot High Endurance (WHEC)
        setSpecific((byte)5); // uid 12110, Hamilton (WHEC 715)
    }
}
