package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16610890;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15868
 */
public class AS350B2Ecureuil extends EntityType
{
    /** Default constructor */
    public AS350B2Ecureuil()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)13); // uid 15862, Eurocopter AS 350 Ecureuil/Astar and AS 550 Fennec
        setSpecific((byte)6); // uid 15868, AS 350B2 Ecureuil
    }
}
