package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c6bd624;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22033
 */
public class OneReactorUnit12 extends EntityType
{
    /** Default constructor */
    public OneReactorUnit12()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 22023, Nuclear Power Plant
        setSubCategory((byte)3); // uid 22031, High Temperature Gas-cooled Reactor (HTGR)
        setSpecific((byte)1); // uid 22033, One Reactor Unit
    }
}
