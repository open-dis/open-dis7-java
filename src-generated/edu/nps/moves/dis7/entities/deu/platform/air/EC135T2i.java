package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6692b6c6;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 32998
 */
public class EC135T2i extends EntityType
{
    /** Default constructor */
    public EC135T2i()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)90); // uid 24076, Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg)
        setSubCategory((byte)13); // uid 24077, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
        setSpecific((byte)1); // uid 24078, Eurocopter EC135
        setExtra((byte)6); // uid 32998, EC135 T2i
    }
}
