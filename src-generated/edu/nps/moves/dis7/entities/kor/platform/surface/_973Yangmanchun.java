package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f80fafe;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23149
 */
public class _973Yangmanchun extends EntityType
{
    /** Default constructor */
    public _973Yangmanchun()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 23145, Guided Missile Destroyer (DDG)
        setSubCategory((byte)1); // uid 23146, Kwanggaeto Daewang (KDX-1) Class
        setSpecific((byte)3); // uid 23149, 973 Yangmanchun
    }
}
