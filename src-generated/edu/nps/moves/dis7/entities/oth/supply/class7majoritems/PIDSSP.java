package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@11180750;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_7_MAJOR_ITEMS;
 *
 * Entity type uid: 30736
 */
public class PIDSSP extends EntityType
{
    /** Default constructor */
    public PIDSSP()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)6); // uid 30698, J - Racks, Adaptors, Pylons
        setSubCategory((byte)2); // uid 30721, Air to Air (A/A) Weapon Rack
        setSpecific((byte)15); // uid 30736, PIDS-SP
    }
}
