package edu.nps.moves.dis7.entities.chn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30fa8a6b;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 28851
 */
public class CETCJY50 extends EntityType
{
    /** Default constructor */
    public CETCJY50()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 28849, RF Passive (intercept and DF)
        setSubCategory((byte)2); // uid 28850, Early Warning/Surveillance
        setSpecific((byte)2); // uid 28851, CETC JY-50
    }
}
