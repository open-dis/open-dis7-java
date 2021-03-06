package edu.nps.moves.dis7.entities.usa.sensoremitter.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45f1413c;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: AIR;
 *
 * Entity type uid: 22370
 */
public class JLENSPTIRSensor extends EntityType
{
    /** Default constructor */
    public JLENSPTIRSensor()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22368, RF active
        setSubCategory((byte)2); // uid 22369, Early Warning/Surveillance
        setSpecific((byte)1); // uid 22370, JLENS PTIR Sensor
    }
}
