package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d622556;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22989
 */
public class ANGSQ187RemoteBattlefieldSensorSystemREMBASS extends EntityType
{
    /** Default constructor */
    public ANGSQ187RemoteBattlefieldSensorSystemREMBASS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 22987, Multi-spectral
        setSubCategory((byte)24); // uid 22988, Battlefield Surveillance
        setSpecific((byte)1); // uid 22989, AN/GSQ-187 Remote Battlefield Sensor System (REMBASS)
    }
}
