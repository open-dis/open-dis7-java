package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12028586;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 17000
 */
public class Y7H500cargo extends EntityType
{
    /** Default constructor */
    public Y7H500cargo()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 16994, Cargo/Tanker
        setSubCategory((byte)2); // uid 16998, Xian Aircraft Company Y-7
        setSpecific((byte)2); // uid 17000, Y-7H-500 (cargo)
    }
}
