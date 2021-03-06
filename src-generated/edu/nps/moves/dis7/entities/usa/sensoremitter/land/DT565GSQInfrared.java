package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2e0652ab;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22993
 */
public class DT565GSQInfrared extends EntityType
{
    /** Default constructor */
    public DT565GSQInfrared()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 22987, Multi-spectral
        setSubCategory((byte)24); // uid 22988, Battlefield Surveillance
        setSpecific((byte)2); // uid 22990, AN/GSQ-187 Improved REMBASS
        setExtra((byte)3); // uid 22993, DT-565/GSQ - Infrared
    }
}
