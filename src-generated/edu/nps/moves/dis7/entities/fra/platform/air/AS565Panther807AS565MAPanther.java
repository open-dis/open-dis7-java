package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1da2cb77;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15892
 */
public class AS565Panther807AS565MAPanther extends EntityType
{
    /** Default constructor */
    public AS565Panther807AS565MAPanther()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)15); // uid 15886, Eurocopter AS 365N2 Dauphin 2
        setSpecific((byte)6); // uid 15892, AS 565 Panther 807, AS 565MA Panther
    }
}
