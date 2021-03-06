package edu.nps.moves.dis7.entities.cze.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4ec4f3a0;
 * Country: Czech Republic (CZE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30097
 */
public class ZlinZ142 extends EntityType
{
    /** Default constructor */
    public ZlinZ142()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 30096, Trainer
        setSubCategory((byte)1); // uid 30097, Zlin Z-142
    }
}
