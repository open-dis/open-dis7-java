package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@35e75f7a
 * Country: Other
 * Entity kind: Cultural feature
 * Domain: LAND
 *
 * Entity type uid: 26482
 */
public class PressureCookerWhite extends EntityType
{
    public PressureCookerWhite()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)22); // uid 26475, Appliances
        setSubCategory((byte)1); // uid 26476, Countertop
        setSpecific((byte)3); // uid 26481, Pressure Cooker
        setExtra((byte)1); // uid 26482, Pressure Cooker, White
    }
}
