package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@79b08632;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13743
 */
public class Yevgenyaclass extends EntityType
{
    /** Default constructor */
    public Yevgenyaclass()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 13709, Mine Countermeasure Ship / Craft
        setSubCategory((byte)11); // uid 13743, Yevgenya class
    }
}
