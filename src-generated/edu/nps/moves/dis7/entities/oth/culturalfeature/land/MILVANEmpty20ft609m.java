package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65af05b2;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22916
 */
public class MILVANEmpty20ft609m extends EntityType
{
    /** Default constructor */
    public MILVANEmpty20ft609m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)16); // uid 22062, Cargo Container
        setSubCategory((byte)1); // uid 22915, MILVAN
        setSpecific((byte)1); // uid 22916, MILVAN, Empty, 20ft (6.09m)
    }
}
