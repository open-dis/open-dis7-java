package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12c8a2c0;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31962
 */
public class AR1A300mmMLRS extends EntityType
{
    /** Default constructor */
    public AR1A300mmMLRS()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)28); // uid 31961, A-100 300mm 8x8 Multiple Launch Rocket System (MLRS)
        setSpecific((byte)1); // uid 31962, AR1A 300mm MLRS
    }
}
