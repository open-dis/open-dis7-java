package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@605eb072;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_7_MAJOR_ITEMS;
 *
 * Entity type uid: 30702
 */
public class BRU57ASmartBombRack extends EntityType
{
    /** Default constructor */
    public BRU57ASmartBombRack()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)6); // uid 30698, J - Racks, Adaptors, Pylons
        setSubCategory((byte)1); // uid 30699, Air to Ground (A/G) Weapon Rack
        setSpecific((byte)3); // uid 30702, BRU-57A Smart Bomb Rack
    }
}
