package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3d6f0054;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28204
 */
public class AS532U2CougarMKIINetherlands extends EntityType
{
    /** Default constructor */
    public AS532U2CougarMKIINetherlands()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)9); // uid 15851, Eurocopter AS 532 Cougar
        setSpecific((byte)5); // uid 28204, AS-532U2 Cougar MK II (Netherlands)
    }
}
