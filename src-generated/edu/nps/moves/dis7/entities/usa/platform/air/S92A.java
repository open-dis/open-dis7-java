package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1983b48a;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 26285
 */
public class S92A extends EntityType
{
    /** Default constructor */
    public S92A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)92); // uid 26282, Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg)
        setSubCategory((byte)12); // uid 26283, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)1); // uid 26284, Sikorsky S-92
        setExtra((byte)1); // uid 26285, S-92A
    }
}
