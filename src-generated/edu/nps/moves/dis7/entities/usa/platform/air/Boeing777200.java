package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2251b3bc;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24320
 */
public class Boeing777200 extends EntityType
{
    /** Default constructor */
    public Boeing777200()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)88); // uid 23813, Civilian Fixed Wing Aircraft, Heavy (above 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23814, Twin Jet
        setSpecific((byte)2); // uid 23816, Boeing 777
        setExtra((byte)1); // uid 24320, Boeing 777-200
    }
}
