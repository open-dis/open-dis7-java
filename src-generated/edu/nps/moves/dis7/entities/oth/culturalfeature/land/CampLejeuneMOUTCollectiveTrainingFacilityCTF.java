package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@15f519f7;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22040
 */
public class CampLejeuneMOUTCollectiveTrainingFacilityCTF extends EntityType
{
    /** Default constructor */
    public CampLejeuneMOUTCollectiveTrainingFacilityCTF()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 22040, Camp Lejeune MOUT Collective Training Facility (CTF)
    }
}
