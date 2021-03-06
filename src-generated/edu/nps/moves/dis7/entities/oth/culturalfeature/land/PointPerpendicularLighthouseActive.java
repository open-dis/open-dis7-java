package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@29f3185c;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 30284
 */
public class PointPerpendicularLighthouseActive extends EntityType
{
    /** Default constructor */
    public PointPerpendicularLighthouseActive()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 22063, Tower
        setSubCategory((byte)5); // uid 29789, Lighthouse
        setSpecific((byte)1); // uid 29790, Lighthouse, Short (<20m)
        setExtra((byte)1); // uid 30284, Point Perpendicular Lighthouse (Active)
    }
}
