package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@588df31b;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29337
 */
public class Q5IVQ5D extends EntityType
{
    /** Default constructor */
    public Q5IVQ5D()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 16977, Attack/Strike
        setSubCategory((byte)2); // uid 16979, Nanchang Q-5 (Fantan)
        setSpecific((byte)7); // uid 29337, Q-5IV / Q-5D
    }
}
