package edu.nps.moves.dis7.entities.nld.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5bde6148
 * Country: Netherlands (NLD)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 22571
 */
public class Multifunction extends EntityType
{
    public Multifunction()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22570, RF Active
        setSubCategory((byte)1); // uid 22571, Multi-function
    }
}
