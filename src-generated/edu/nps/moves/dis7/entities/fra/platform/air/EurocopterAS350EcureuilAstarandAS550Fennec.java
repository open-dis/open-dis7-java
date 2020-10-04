package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3c7f66c4
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 15862
 */
public class EurocopterAS350EcureuilAstarandAS550Fennec extends EntityType
{
    public EurocopterAS350EcureuilAstarandAS550Fennec()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)13); // uid 15862, Eurocopter AS 350 Ecureuil/Astar and AS 550 Fennec
    }
}
