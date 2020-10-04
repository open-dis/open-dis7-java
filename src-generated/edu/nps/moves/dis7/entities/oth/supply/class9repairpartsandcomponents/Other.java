package edu.nps.moves.dis7.entities.oth.supply.class9repairpartsandcomponents;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3568ea59
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_9_REPAIR_PARTS_AND_COMPONENTS
 *
 * Entity type uid: 30615
 */
public class Other extends EntityType
{
    public Other()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_9_REPAIR_PARTS_AND_COMPONENTS));

        setCategory((byte)1); // uid 30615, Other
    }
}
