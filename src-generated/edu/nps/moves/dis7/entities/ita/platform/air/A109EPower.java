package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@75b25825;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28504
 */
public class A109EPower extends EntityType
{
    /** Default constructor */
    public A109EPower()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)90); // uid 28496, Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg)
        setSubCategory((byte)12); // uid 28497, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)1); // uid 28498, Agusta Westland AW109
        setExtra((byte)6); // uid 28504, A109E Power
    }
}
