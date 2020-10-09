package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@401ec794
 * Country: Other
 * Entity kind: Cultural feature
 * Domain: LAND
 *
 * Entity type uid: 22082
 */
public class SingleLaneSteelSuspensionBridgeSpan extends EntityType
{
    public SingleLaneSteelSuspensionBridgeSpan()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 22073, Bridge Span
        setSubCategory((byte)1); // uid 22075, Single Lane Each Way
        setSpecific((byte)7); // uid 22082, Single Lane Steel Suspension Bridge Span
    }
}
