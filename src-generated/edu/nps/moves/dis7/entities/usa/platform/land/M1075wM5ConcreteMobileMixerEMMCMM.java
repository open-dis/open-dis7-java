package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2db1b657;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30292
 */
public class M1075wM5ConcreteMobileMixerEMMCMM extends EntityType
{
    /** Default constructor */
    public M1075wM5ConcreteMobileMixerEMMCMM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)38); // uid 10576, Truck, Heavy, M1075 PLS
        setSpecific((byte)2); // uid 30292, M1075 w/ M5 Concrete Mobile Mixer (EMM-CMM)
    }
}
