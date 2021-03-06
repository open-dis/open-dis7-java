package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4f80542f;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28596
 */
public class EC225e extends EntityType
{
    /** Default constructor */
    public EC225e()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)92); // uid 28591, Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg)
        setSubCategory((byte)12); // uid 28592, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)1); // uid 28593, Airbus Helicopters EC225 Super Puma Mk II+
        setExtra((byte)3); // uid 28596, EC225e
    }
}
