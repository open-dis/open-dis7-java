package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4ae49387;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 26447
 */
public class SurveyStakeRedFlag extends EntityType
{
    /** Default constructor */
    public SurveyStakeRedFlag()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)8); // uid 26445, Survey Stake
        setSpecific((byte)1); // uid 26446, Survey Stake, Flagged
        setExtra((byte)1); // uid 26447, Survey Stake, Red Flag
    }
}
