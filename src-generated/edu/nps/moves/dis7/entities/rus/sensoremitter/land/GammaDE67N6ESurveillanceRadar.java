package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78b9155e;
 * Country: Russia (RUS);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 24149
 */
public class GammaDE67N6ESurveillanceRadar extends EntityType
{
    /** Default constructor */
    public GammaDE67N6ESurveillanceRadar()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22411, RF Active
        setSubCategory((byte)2); // uid 22415, Early Warning/Surveillance Radar
        setSpecific((byte)13); // uid 24149, Gamma-DE (67N6E) Surveillance Radar
    }
}
