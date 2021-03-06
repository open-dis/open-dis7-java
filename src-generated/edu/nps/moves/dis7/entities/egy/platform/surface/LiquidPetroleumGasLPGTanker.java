package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3bd82cf5;
 * Country: Egypt (EGY);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24607
 */
public class LiquidPetroleumGasLPGTanker extends EntityType
{
    /** Default constructor */
    public LiquidPetroleumGasLPGTanker()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24606, Tanker (Group 3 Merchant)
        setSubCategory((byte)1); // uid 24607, Liquid Petroleum Gas (LPG)Tanker
    }
}
