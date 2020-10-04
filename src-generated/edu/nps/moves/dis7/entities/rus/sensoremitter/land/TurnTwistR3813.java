package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37c87fcc
 * Country: Russia (RUS)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 22837
 */
public class TurnTwistR3813 extends EntityType
{
    public TurnTwistR3813()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 22833, RF Passive (intercept and DF)
        setSubCategory((byte)16); // uid 22834, Identification/Classification (including IFF)
        setSpecific((byte)3); // uid 22837, Turn Twist R-381-3
    }
}
