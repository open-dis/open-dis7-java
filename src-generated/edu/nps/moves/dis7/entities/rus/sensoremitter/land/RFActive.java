package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@11015ca0;
 * Country: Russia (RUS);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22411
 */
public class RFActive extends EntityType
{
    /** Default constructor */
    public RFActive()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22411, RF Active
    }
}
