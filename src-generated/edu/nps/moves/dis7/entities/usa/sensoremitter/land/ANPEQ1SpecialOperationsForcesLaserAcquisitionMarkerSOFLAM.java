package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e5b33e5;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 32303
 */
public class ANPEQ1SpecialOperationsForcesLaserAcquisitionMarkerSOFLAM extends EntityType
{
    /** Default constructor */
    public ANPEQ1SpecialOperationsForcesLaserAcquisitionMarkerSOFLAM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 23721, Electro-Optical
        setSubCategory((byte)60); // uid 23722, Missile Guidance
        setSpecific((byte)2); // uid 32303, AN/PEQ-1 Special Operations Forces Laser Acquisition Marker (SOFLAM)
    }
}
