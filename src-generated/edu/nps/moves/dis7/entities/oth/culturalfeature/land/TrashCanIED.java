package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ac4e690;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 31858
 */
public class TrashCanIED extends EntityType
{
    /** Default constructor */
    public TrashCanIED()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)30); // uid 26175, Exposed Ordnance
        setSpecific((byte)10); // uid 31858, Trash Can, IED
    }
}
