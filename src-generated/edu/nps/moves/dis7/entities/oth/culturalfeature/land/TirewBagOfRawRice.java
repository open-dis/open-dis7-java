package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2729bb71;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 26469
 */
public class TirewBagOfRawRice extends EntityType
{
    /** Default constructor */
    public TirewBagOfRawRice()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)35); // uid 26464, Tire Pile
        setSpecific((byte)10); // uid 26468, Tire Pile, Single
        setExtra((byte)1); // uid 26469, Tire w/ Bag Of Raw Rice
    }
}
