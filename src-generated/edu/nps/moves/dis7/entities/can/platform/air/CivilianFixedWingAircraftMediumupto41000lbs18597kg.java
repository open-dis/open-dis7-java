package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@7d907bac;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23878
 */
public class CivilianFixedWingAircraftMediumupto41000lbs18597kg extends EntityType
{
    /** Default constructor */
    public CivilianFixedWingAircraftMediumupto41000lbs18597kg()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)86); // uid 23878, Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg)
    }
}
