package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@334b392d;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_12_SLING_LOADS_NON_DOCTRINAL;
 *
 * Entity type uid: 31993
 */
public class NettedLoadWith25mStrop extends EntityType
{
    /** Default constructor */
    public NettedLoadWith25mStrop()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)3); // uid 30821, Sling Load, Crate
        setSubCategory((byte)4); // uid 31992, Sling Load, Crate, Netted Load
        setSpecific((byte)1); // uid 31993, Netted Load With 2.5m Strop
    }
}
