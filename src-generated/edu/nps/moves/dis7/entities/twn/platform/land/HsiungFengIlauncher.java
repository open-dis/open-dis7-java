package edu.nps.moves.dis7.entities.twn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7e74a380;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 19135
 */
public class HsiungFengIlauncher extends EntityType
{
    /** Default constructor */
    public HsiungFengIlauncher()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 19134, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 19135, Hsiung Feng I launcher
    }
}
