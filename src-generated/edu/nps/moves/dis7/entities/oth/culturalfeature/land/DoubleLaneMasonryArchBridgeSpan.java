package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77ba583;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22091
 */
public class DoubleLaneMasonryArchBridgeSpan extends EntityType
{
    /** Default constructor */
    public DoubleLaneMasonryArchBridgeSpan()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 22073, Bridge Span
        setSubCategory((byte)2); // uid 22088, Double Lane Each Way
        setSpecific((byte)3); // uid 22091, Double Lane Masonry Arch Bridge Span
    }
}
