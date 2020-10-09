package edu.nps.moves.dis7.entities.omn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1e392345
 * Country: Oman (OMN)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 28563
 */
public class BAESystemsHawk extends EntityType
{
    public BAESystemsHawk()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 28562, Attack/Strike
        setSubCategory((byte)1); // uid 28563, BAE Systems Hawk
    }
}
