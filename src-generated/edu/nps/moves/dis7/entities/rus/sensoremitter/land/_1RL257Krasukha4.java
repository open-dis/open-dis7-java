package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3dc55719;
 * Country: Russia (RUS);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 32296
 */
public class _1RL257Krasukha4 extends EntityType
{
    /** Default constructor */
    public _1RL257Krasukha4()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22411, RF Active
        setSubCategory((byte)42); // uid 32292, Jammer
        setSpecific((byte)2); // uid 32294, Krasukha
        setExtra((byte)2); // uid 32296, 1RL257 Krasukha-4
    }
}
