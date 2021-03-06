package edu.nps.moves.dis7.entities.irn.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4449a60b;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 26688
 */
public class ANSSQ47B extends EntityType
{
    /** Default constructor */
    public ANSSQ47B()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 26686, Acoustic, Active
        setSubCategory((byte)77); // uid 26687, Sonobuoy
        setSpecific((byte)5); // uid 26688, AN/SSQ-47B
    }
}
