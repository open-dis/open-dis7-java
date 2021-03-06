package edu.nps.moves.dis7.entities.mlt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6928f576;
 * Country: Malta (MLT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24542
 */
public class LiquidPetroleumGasLPGTanker extends EntityType
{
    /** Default constructor */
    public LiquidPetroleumGasLPGTanker()
    {
        setCountry(Country.MALTA_MLT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24541, Tanker (Group 3 Merchant)
        setSubCategory((byte)1); // uid 24542, Liquid Petroleum Gas (LPG)Tanker
    }
}
