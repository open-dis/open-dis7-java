package edu.nps.moves.dis7.entities.oth.supply.class1subsistence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3cbfdf5c
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_1_SUBSISTENCE
 *
 * Entity type uid: 30652
 */
public class SOtherNonRefrigerated extends EntityType
{
    public SOtherNonRefrigerated()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_1_SUBSISTENCE));

        setCategory((byte)5); // uid 30652, S - Other Non-Refrigerated
    }
}
