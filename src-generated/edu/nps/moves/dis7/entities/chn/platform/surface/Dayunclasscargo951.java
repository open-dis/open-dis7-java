package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@96def03;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17324
 */
public class Dayunclasscargo951 extends EntityType
{
    /** Default constructor */
    public Dayunclasscargo951()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17231, Auxiliary
        setSubCategory((byte)30); // uid 17323, Dayun class (cargo)
        setSpecific((byte)1); // uid 17324, 951
    }
}
