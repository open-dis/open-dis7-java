package edu.nps.moves.dis7.entities.jpn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d685f4e;
 * Country: Japan (JPN);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22594
 */
public class FR2855W extends EntityType
{
    /** Default constructor */
    public FR2855W()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22592, RF Active
        setSubCategory((byte)2); // uid 22593, Multi-function
        setSpecific((byte)1); // uid 22594, FR-2855W
    }
}
