package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7946e1f4;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32022
 */
public class M60A3TTS extends EntityType
{
    /** Default constructor */
    public M60A3TTS()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 32021, Tank
        setSubCategory((byte)1); // uid 32022, M60A3 TTS
    }
}
