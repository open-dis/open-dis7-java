package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@75bf9e67;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 22399
 */
public class ANSSQ53EDIFAR extends EntityType
{
    /** Default constructor */
    public ANSSQ53EDIFAR()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 22395, Acoustic, Passive
        setSubCategory((byte)77); // uid 22396, Sonobuoy
        setSpecific((byte)1); // uid 22397, AN/SSQ-53 DIFAR (Directional Frequency Analysis Recording)
        setExtra((byte)2); // uid 22399, AN/SSQ-53E DIFAR
    }
}
