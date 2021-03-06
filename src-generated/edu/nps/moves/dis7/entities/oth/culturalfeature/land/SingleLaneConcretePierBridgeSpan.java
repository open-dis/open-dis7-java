package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ff8a3ad;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22077
 */
public class SingleLaneConcretePierBridgeSpan extends EntityType
{
    /** Default constructor */
    public SingleLaneConcretePierBridgeSpan()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 22073, Bridge Span
        setSubCategory((byte)1); // uid 22075, Single Lane Each Way
        setSpecific((byte)2); // uid 22077, Single Lane Concrete Pier Bridge Span
    }
}
