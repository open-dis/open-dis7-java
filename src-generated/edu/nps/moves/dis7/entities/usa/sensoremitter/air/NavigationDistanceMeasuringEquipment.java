package edu.nps.moves.dis7.entities.usa.sensoremitter.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@16029e2f;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: AIR;
 *
 * Entity type uid: 25018
 */
public class NavigationDistanceMeasuringEquipment extends EntityType
{
    /** Default constructor */
    public NavigationDistanceMeasuringEquipment()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 25017, Multi-spectral
        setSubCategory((byte)71); // uid 25018, Navigation/Distance Measuring Equipment
    }
}
