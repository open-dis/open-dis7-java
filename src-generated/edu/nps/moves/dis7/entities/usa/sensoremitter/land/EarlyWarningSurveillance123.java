package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@adc8683;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 23655
 */
public class EarlyWarningSurveillance123 extends EntityType
{
    /** Default constructor */
    public EarlyWarningSurveillance123()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)8); // uid 22364, Chemical, standoff
        setSubCategory((byte)2); // uid 23655, Early Warning/Surveillance
    }
}
