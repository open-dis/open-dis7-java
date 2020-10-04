package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@21c34bf8
 * Country: United States of America (USA)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 22355
 */
public class ANPPS15AV1 extends EntityType
{
    public ANPPS15AV1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22317, RF Active
        setSubCategory((byte)24); // uid 22353, Battlefield Surveillance
        setSpecific((byte)2); // uid 22355, AN/PPS-15A (V1)
    }
}