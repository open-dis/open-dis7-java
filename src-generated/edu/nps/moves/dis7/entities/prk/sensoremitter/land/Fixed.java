package edu.nps.moves.dis7.entities.prk.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e426dd2;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22532
 */
public class Fixed extends EntityType
{
    /** Default constructor */
    public Fixed()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22530, RF Active
        setSubCategory((byte)1); // uid 22531, Multi-function
        setSpecific((byte)1); // uid 22532, Fixed
    }
}
