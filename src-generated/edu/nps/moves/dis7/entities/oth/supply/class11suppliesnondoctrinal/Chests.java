package edu.nps.moves.dis7.entities.oth.supply.class11suppliesnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@165aa43a
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_11_SUPPLIES_NON_DOCTRINAL
 *
 * Entity type uid: 30609
 */
public class Chests extends EntityType
{
    public Chests()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_11_SUPPLIES_NON_DOCTRINAL));

        setCategory((byte)4); // uid 30609, Chests
    }
}
