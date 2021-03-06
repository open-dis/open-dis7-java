package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24fcf36f;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15821
 */
public class AS532AL extends EntityType
{
    /** Default constructor */
    public AS532AL()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 15818, Attack Helicopter
        setSubCategory((byte)1); // uid 15819, Eurocopter AS 532 Cougar
        setSpecific((byte)2); // uid 15821, AS 532AL
    }
}
