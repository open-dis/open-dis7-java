package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45afc369;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 16996
 */
public class Y8Ahelicoptercarrier extends EntityType
{
    /** Default constructor */
    public Y8Ahelicoptercarrier()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 16994, Cargo/Tanker
        setSubCategory((byte)1); // uid 16995, Shaanxi Aircraft Company Y-8
        setSpecific((byte)1); // uid 16996, Y-8A (helicopter carrier)
    }
}
