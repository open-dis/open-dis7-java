package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75f9eccc;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17104
 */
public class _536Wuhu extends EntityType
{
    /** Default constructor */
    public _536Wuhu()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17073, Guided Missile Frigate (FFG)
        setSubCategory((byte)3); // uid 17102, Jianghu-III Class (Type 053H2)
        setSpecific((byte)2); // uid 17104, 536 Wuhu
    }
}
