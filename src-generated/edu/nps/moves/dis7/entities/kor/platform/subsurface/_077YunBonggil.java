package edu.nps.moves.dis7.entities.kor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a1217f9;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 30427
 */
public class _077YunBonggil extends EntityType
{
    /** Default constructor */
    public _077YunBonggil()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 30421, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
        setSubCategory((byte)1); // uid 30422, Sohn Won-il Class (Type 214)
        setSpecific((byte)5); // uid 30427, 077 Yun Bong-gil
    }
}
