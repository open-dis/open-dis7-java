package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5e541ef9
 * Country: Other
 * Entity kind: Cultural feature
 * Domain: LAND
 *
 * Entity type uid: 21994
 */
public class Preparedpositions extends EntityType
{
    public Preparedpositions()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 21994, Prepared positions
    }
}
