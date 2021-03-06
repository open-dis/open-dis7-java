package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@646811d6;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13400
 */
public class SurveillanceC2 extends EntityType
{
    /** Default constructor */
    public SurveillanceC2()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 13400, Surveillance/C2
    }
}
