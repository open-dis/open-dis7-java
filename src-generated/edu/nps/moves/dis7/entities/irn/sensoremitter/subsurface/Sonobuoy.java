package edu.nps.moves.dis7.entities.irn.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@da5d5e1;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 26687
 */
public class Sonobuoy extends EntityType
{
    /** Default constructor */
    public Sonobuoy()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 26686, Acoustic, Active
        setSubCategory((byte)77); // uid 26687, Sonobuoy
    }
}
