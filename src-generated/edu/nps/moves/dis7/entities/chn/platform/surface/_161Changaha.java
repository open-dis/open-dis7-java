package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a4aa2f2;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17060
 */
public class _161Changaha extends EntityType
{
    /** Default constructor */
    public _161Changaha()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 17046, Guided Missile Destroyer (DDG)
        setSubCategory((byte)2); // uid 17049, Luda Class (Type 051)
        setSpecific((byte)11); // uid 17060, 161 Changaha
    }
}
