package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15b642b9
 * Country: Taiwan, Province of China (TWN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 24215
 */
public class _158YungChuan extends EntityType
{
    public _158YungChuan()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 19219, Mine Coutermeasures Ship/Craft
        setSubCategory((byte)2); // uid 24214, Adjutant Class
        setSpecific((byte)1); // uid 24215, 158 Yung Chuan
    }
}
