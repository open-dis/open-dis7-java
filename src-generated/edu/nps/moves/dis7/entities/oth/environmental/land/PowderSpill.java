package edu.nps.moves.dis7.entities.oth.environmental.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5fdb7394;
 * Country: Other;
 * Entity kind: Environmental;
 * Domain: LAND;
 *
 * Entity type uid: 23896
 */
public class PowderSpill extends EntityType
{
    /** Default constructor */
    public PowderSpill()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 23896, Powder Spill
    }
}
