package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77f4c040;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29419
 */
public class Cessna152 extends EntityType
{
    /** Default constructor */
    public Cessna152()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 23782, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 23783, Single Piston Engine
        setSpecific((byte)4); // uid 29419, Cessna 152
    }
}
