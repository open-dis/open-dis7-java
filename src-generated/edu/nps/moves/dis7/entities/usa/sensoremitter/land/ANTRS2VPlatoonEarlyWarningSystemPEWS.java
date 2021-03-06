package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@510e4d79;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 23713
 */
public class ANTRS2VPlatoonEarlyWarningSystemPEWS extends EntityType
{
    /** Default constructor */
    public ANTRS2VPlatoonEarlyWarningSystemPEWS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 23711, Seismic
        setSubCategory((byte)2); // uid 23712, Early Warning/Surveillance
        setSpecific((byte)1); // uid 23713, AN/TRS-2(V) Platoon Early Warning System (PEWS)
    }
}
