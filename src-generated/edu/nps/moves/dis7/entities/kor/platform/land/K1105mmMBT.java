package edu.nps.moves.dis7.entities.kor.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6a988392;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 17621
 */
public class K1105mmMBT extends EntityType
{
    /** Default constructor */
    public K1105mmMBT()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 17619, Tank
        setSubCategory((byte)2); // uid 17621, K1 105mm MBT
    }
}
