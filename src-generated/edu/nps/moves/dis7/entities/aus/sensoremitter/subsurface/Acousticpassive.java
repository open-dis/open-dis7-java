package edu.nps.moves.dis7.entities.aus.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@428eb3d5;
 * Country: Australia (AUS);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 22556
 */
public class Acousticpassive extends EntityType
{
    /** Default constructor */
    public Acousticpassive()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 22556, Acoustic, passive
    }
}
