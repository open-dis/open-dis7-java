package edu.nps.moves.dis7.entities.kor.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2b58f754;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 17624
 */
public class KM900ArmoredPersonnelCarrier extends EntityType
{
    /** Default constructor */
    public KM900ArmoredPersonnelCarrier()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 17623, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 17624, KM900 Armored Personnel Carrier
    }
}
