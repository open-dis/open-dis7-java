package edu.nps.moves.dis7.entities.lbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@355e34c7;
 * Country: Liberia (LBR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24524
 */
public class LiquidPetroleumGasLPGTanker extends EntityType
{
    /** Default constructor */
    public LiquidPetroleumGasLPGTanker()
    {
        setCountry(Country.LIBERIA_LBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24523, Tanker (Group 3 Merchant)
        setSubCategory((byte)1); // uid 24524, Liquid Petroleum Gas (LPG)Tanker
    }
}
