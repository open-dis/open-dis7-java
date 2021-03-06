package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@eb91027;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 23654
 */
public class BiologicalAerosolWarningSystemBAWS extends EntityType
{
    /** Default constructor */
    public BiologicalAerosolWarningSystemBAWS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 22359, Chemical, point detector
        setSubCategory((byte)2); // uid 22362, Early Warning/Surveillance
        setSpecific((byte)3); // uid 23654, Biological Aerosol Warning System (BAWS)
    }
}
