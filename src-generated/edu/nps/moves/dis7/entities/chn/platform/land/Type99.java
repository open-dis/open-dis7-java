package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13c27452;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31225
 */
public class Type99 extends EntityType
{
    /** Default constructor */
    public Type99()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 16857, Tank
        setSubCategory((byte)9); // uid 23527, Type 99
        setSpecific((byte)1); // uid 31225, Type 99
    }
}
