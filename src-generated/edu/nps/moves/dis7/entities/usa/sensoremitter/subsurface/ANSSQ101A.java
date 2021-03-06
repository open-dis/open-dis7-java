package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@76e00bdb;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 26681
 */
public class ANSSQ101A extends EntityType
{
    /** Default constructor */
    public ANSSQ101A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 22395, Acoustic, Passive
        setSubCategory((byte)77); // uid 22396, Sonobuoy
        setSpecific((byte)4); // uid 24152, AN/SSQ-101 ADAR (Air Deployed Active Receiver)
        setExtra((byte)1); // uid 26681, AN/SSQ-101A
    }
}
