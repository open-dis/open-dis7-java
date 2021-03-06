package edu.nps.moves.dis7.entities.oth.environmental.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75d97e18;
 * Country: Other;
 * Entity kind: Environmental;
 * Domain: LAND;
 *
 * Entity type uid: 23898
 */
public class PowderSpillResidue extends EntityType
{
    /** Default constructor */
    public PowderSpillResidue()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 23896, Powder Spill
        setSpecific((byte)1); // uid 23898, Powder Spill, Residue
    }
}
