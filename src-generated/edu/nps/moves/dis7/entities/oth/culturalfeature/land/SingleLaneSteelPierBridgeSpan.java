package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@271e851e;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22081
 */
public class SingleLaneSteelPierBridgeSpan extends EntityType
{
    /** Default constructor */
    public SingleLaneSteelPierBridgeSpan()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 22073, Bridge Span
        setSubCategory((byte)1); // uid 22075, Single Lane Each Way
        setSpecific((byte)6); // uid 22081, Single Lane Steel Pier Bridge Span
    }
}
