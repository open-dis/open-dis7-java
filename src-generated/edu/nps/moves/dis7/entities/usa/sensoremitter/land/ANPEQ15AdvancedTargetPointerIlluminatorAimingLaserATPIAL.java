package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b52b18a;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 32301
 */
public class ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL extends EntityType
{
    /** Default constructor */
    public ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 23721, Electro-Optical
        setSubCategory((byte)7); // uid 32300, Guidance/Illumination
        setSpecific((byte)1); // uid 32301, AN/PEQ-15 Advanced Target Pointer Illuminator Aiming Laser (ATPIAL)
    }
}
