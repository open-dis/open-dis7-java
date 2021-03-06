package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45c423b3;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 26929
 */
public class CardboardBoxesExtraLarge extends EntityType
{
    /** Default constructor */
    public CardboardBoxesExtraLarge()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)21); // uid 23581, Cardboard Boxes
        setSpecific((byte)4); // uid 26929, Cardboard Boxes, Extra Large
    }
}
