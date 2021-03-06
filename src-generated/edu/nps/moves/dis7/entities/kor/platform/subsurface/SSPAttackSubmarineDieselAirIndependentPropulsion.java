package edu.nps.moves.dis7.entities.kor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@a7e2d9d;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 30421
 */
public class SSPAttackSubmarineDieselAirIndependentPropulsion extends EntityType
{
    /** Default constructor */
    public SSPAttackSubmarineDieselAirIndependentPropulsion()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 30421, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
    }
}
