package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@a7e666
 * Country: Canada (CAN)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 18773
 */
public class CE144Challenger extends EntityType
{
    public CE144Challenger()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 18772, Electronic Warfare (EW)
        setSubCategory((byte)1); // uid 18773, CE144 Challenger
    }
}