package edu.nps.moves.dis7.entities.kor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@644c78d4;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23152
 */
public class _066LeeJongmu extends EntityType
{
    /** Default constructor */
    public _066LeeJongmu()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17737, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 17738, Chang Bogo (Type 209) Class)
        setSpecific((byte)5); // uid 23152, 066 Lee Jongmu
    }
}
