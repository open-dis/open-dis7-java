package edu.nps.moves.dis7.entities.kor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2f2bf0e2
 * Country: Korea (Republic of) (KOR)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 30422
 */
public class SohnWonilClassType214 extends EntityType
{
    public SohnWonilClassType214()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 30421, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
        setSubCategory((byte)1); // uid 30422, Sohn Won-il Class (Type 214)
    }
}