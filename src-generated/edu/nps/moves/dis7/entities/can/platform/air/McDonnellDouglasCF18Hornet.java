package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@71423665;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30988
 */
public class McDonnellDouglasCF18Hornet extends EntityType
{
    /** Default constructor */
    public McDonnellDouglasCF18Hornet()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 30987, Fighter/Air Defense
        setSubCategory((byte)1); // uid 30988, McDonnell Douglas CF-18 Hornet
    }
}
