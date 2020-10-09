package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43ab0659
 * Country: Russia (RUS)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 22430
 */
public class SideNetPRV11 extends EntityType
{
    public SideNetPRV11()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22411, RF Active
        setSubCategory((byte)3); // uid 22427, Height Finding Radar
        setSpecific((byte)3); // uid 22430, Side Net (PRV-11)
    }
}
