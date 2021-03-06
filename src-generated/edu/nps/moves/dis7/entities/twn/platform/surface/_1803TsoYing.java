package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@26cb5207;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31414
 */
public class _1803TsoYing extends EntityType
{
    /** Default constructor */
    public _1803TsoYing()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 31410, Guided Missile Destroyer (DDG)
        setSubCategory((byte)1); // uid 31411, Kee Lung Class (Kidd Class)
        setSpecific((byte)3); // uid 31414, 1803 Tso Ying
    }
}
