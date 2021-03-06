package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3d24420b;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10685
 */
public class HAWKCWARContinuousWaveAcquisitionRadarANMPQ34485562 extends EntityType
{
    /** Default constructor */
    public HAWKCWARContinuousWaveAcquisitionRadarANMPQ34485562()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 10680, MIM-23 Raytheon HAWK Low-to-Medium Altitude SAM System
        setSpecific((byte)2); // uid 10683, Battery
        setExtra((byte)2); // uid 10685, HAWK CWAR (Continuous Wave Acquisition Radar) AN/MPQ-34/48/55/62
    }
}
