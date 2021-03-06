package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f07930a;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 26462
 */
public class Barrels30GalLarge extends EntityType
{
    /** Default constructor */
    public Barrels30GalLarge()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)29); // uid 26459, Barrels, 30 Gal
        setSpecific((byte)3); // uid 26462, Barrels, 30 Gal, Large
    }
}
