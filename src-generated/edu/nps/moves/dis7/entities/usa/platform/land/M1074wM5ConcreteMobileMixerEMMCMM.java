package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1c3259fa;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30289
 */
public class M1074wM5ConcreteMobileMixerEMMCMM extends EntityType
{
    /** Default constructor */
    public M1074wM5ConcreteMobileMixerEMMCMM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)19); // uid 10543, Oshkosh Heavy Expanded Mobility Tactical Truck (HEMTT) 8x8 9979-kg
        setSpecific((byte)10); // uid 10553, Truck, Heavy, M1074 PLS
        setExtra((byte)2); // uid 30289, M1074 w/ M5 Concrete Mobile Mixer (EMM-CMM)
    }
}
