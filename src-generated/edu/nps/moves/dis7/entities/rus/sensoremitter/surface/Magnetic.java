package edu.nps.moves.dis7.entities.rus.sensoremitter.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@e91facf;
 * Country: Russia (RUS);
 * Entity kind: Sensor/Emitter;
 * Domain: SURFACE;
 *
 * Entity type uid: 28228
 */
public class Magnetic extends EntityType
{
    /** Default constructor */
    public Magnetic()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 28228, Magnetic
    }
}
