package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7c041b41;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17671
 */
public class _782KwanMyong extends EntityType
{
    /** Default constructor */
    public _782KwanMyong()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17638, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 17649, Po Hang Class (Corvette)
        setSpecific((byte)22); // uid 17671, 782 Kwan Myong
    }
}
