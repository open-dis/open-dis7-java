package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3bfae028;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 31726
 */
public class S76A extends EntityType
{
    /** Default constructor */
    public S76A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 26275, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
        setSubCategory((byte)12); // uid 26276, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)4); // uid 31725, Sikorsky S-76
        setExtra((byte)1); // uid 31726, S-76A
    }
}
