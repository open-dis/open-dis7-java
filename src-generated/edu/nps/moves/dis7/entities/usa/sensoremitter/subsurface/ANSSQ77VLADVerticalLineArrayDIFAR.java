package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2cadcff6;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 22403
 */
public class ANSSQ77VLADVerticalLineArrayDIFAR extends EntityType
{
    /** Default constructor */
    public ANSSQ77VLADVerticalLineArrayDIFAR()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 22395, Acoustic, Passive
        setSubCategory((byte)77); // uid 22396, Sonobuoy
        setSpecific((byte)3); // uid 22403, AN/SSQ-77 VLAD (Vertical Line Array DIFAR)
    }
}
