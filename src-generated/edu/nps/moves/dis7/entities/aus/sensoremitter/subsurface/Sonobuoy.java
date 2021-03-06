package edu.nps.moves.dis7.entities.aus.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@66a472b9;
 * Country: Australia (AUS);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 22557
 */
public class Sonobuoy extends EntityType
{
    /** Default constructor */
    public Sonobuoy()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 22556, Acoustic, passive
        setSubCategory((byte)77); // uid 22557, Sonobuoy
    }
}
