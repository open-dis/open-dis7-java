package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2fd66ad3;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25301
 */
public class ArtilleryLocatingRadarType704MBL904 extends EntityType
{
    /** Default constructor */
    public ArtilleryLocatingRadarType704MBL904()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 16928, Large Wheeled Utility Vehicle (greater than 1.25 tons)
        setSubCategory((byte)3); // uid 25301, Artillery Locating Radar, Type 704M (BL-904)
    }
}
