package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@75de29c0;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24214
 */
public class AdjutantClass extends EntityType
{
    /** Default constructor */
    public AdjutantClass()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 19219, Mine Coutermeasures Ship/Craft
        setSubCategory((byte)2); // uid 24214, Adjutant Class
    }
}
