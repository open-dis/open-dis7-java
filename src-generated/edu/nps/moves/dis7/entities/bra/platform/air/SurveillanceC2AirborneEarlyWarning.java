package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@68be2bc2;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25698
 */
public class SurveillanceC2AirborneEarlyWarning extends EntityType
{
    /** Default constructor */
    public SurveillanceC2AirborneEarlyWarning()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 25698, Surveillance/C2 (Airborne Early Warning)
    }
}
