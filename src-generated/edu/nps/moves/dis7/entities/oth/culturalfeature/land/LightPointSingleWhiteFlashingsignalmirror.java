package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7417ef4f;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 23736
 */
public class LightPointSingleWhiteFlashingsignalmirror extends EntityType
{
    /** Default constructor */
    public LightPointSingleWhiteFlashingsignalmirror()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)5); // uid 22900, Light Point
        setSpecific((byte)1); // uid 22901, Light Point, Single
        setExtra((byte)7); // uid 23736, Light Point, Single, White, Flashing (signal mirror)
    }
}
