package edu.nps.moves.dis7.entities.kor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@51e4ccb3;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25281
 */
public class Reconnaissance extends EntityType
{
    /** Default constructor */
    public Reconnaissance()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 25281, Reconnaissance
    }
}
