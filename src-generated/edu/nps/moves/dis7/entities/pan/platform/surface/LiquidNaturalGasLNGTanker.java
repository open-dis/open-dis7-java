package edu.nps.moves.dis7.entities.pan.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5a4ed68f;
 * Country: Panama (PAN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26786
 */
public class LiquidNaturalGasLNGTanker extends EntityType
{
    /** Default constructor */
    public LiquidNaturalGasLNGTanker()
    {
        setCountry(Country.PANAMA_PAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24556, Tanker (Group 3 Merchant)
        setSubCategory((byte)3); // uid 26786, Liquid Natural Gas (LNG) Tanker
    }
}
