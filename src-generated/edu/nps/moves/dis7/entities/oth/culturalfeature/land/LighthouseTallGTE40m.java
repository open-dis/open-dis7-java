package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a0d875d;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 29793
 */
public class LighthouseTallGTE40m extends EntityType
{
    /** Default constructor */
    public LighthouseTallGTE40m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 22063, Tower
        setSubCategory((byte)5); // uid 29789, Lighthouse
        setSpecific((byte)3); // uid 29793, Lighthouse, Tall (>=40m)
    }
}
