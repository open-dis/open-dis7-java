package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3aefe5e5
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17277
 */
public class X606 extends EntityType
{
    public X606()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17231, Auxiliary
        setSubCategory((byte)17); // uid 17275, Fulin class (transport oiler)
        setSpecific((byte)2); // uid 17277, X606
    }
}
