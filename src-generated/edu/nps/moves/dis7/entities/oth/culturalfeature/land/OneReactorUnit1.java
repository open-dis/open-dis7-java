package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b9b97ad;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22029
 */
public class OneReactorUnit1 extends EntityType
{
    /** Default constructor */
    public OneReactorUnit1()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 22023, Nuclear Power Plant
        setSubCategory((byte)2); // uid 22028, Gas-Cooled Graphite Reactor
        setSpecific((byte)1); // uid 22029, One Reactor Unit
    }
}
