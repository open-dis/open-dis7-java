package edu.nps.moves.dis7.entities.ind.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@22356acd;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29162
 */
public class HALHPT32Deepak extends EntityType
{
    /** Default constructor */
    public HALHPT32Deepak()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28535, Trainer
        setSubCategory((byte)3); // uid 29162, HAL HPT-32 Deepak
    }
}
