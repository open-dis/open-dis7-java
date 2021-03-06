package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@fba92d3;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15845
 */
public class EurocopterAS332LSuperPumaMKIIandAS532CougarMkII extends EntityType
{
    /** Default constructor */
    public EurocopterAS332LSuperPumaMKIIandAS532CougarMkII()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)7); // uid 15845, Eurocopter AS 332L Super Puma MK II and AS 532 Cougar MkII
    }
}
