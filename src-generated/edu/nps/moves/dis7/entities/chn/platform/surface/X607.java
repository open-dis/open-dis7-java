package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@149e0f5d
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17278
 */
public class X607 extends EntityType
{
    public X607()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17231, Auxiliary
        setSubCategory((byte)17); // uid 17275, Fulin class (transport oiler)
        setSpecific((byte)3); // uid 17278, X607
    }
}