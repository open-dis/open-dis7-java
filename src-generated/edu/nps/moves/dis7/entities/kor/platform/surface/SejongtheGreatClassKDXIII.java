package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5c48c0c0;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29527
 */
public class SejongtheGreatClassKDXIII extends EntityType
{
    /** Default constructor */
    public SejongtheGreatClassKDXIII()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 23145, Guided Missile Destroyer (DDG)
        setSubCategory((byte)3); // uid 29527, Sejong the Great Class (KDX-III)
    }
}
