package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5860f3d7;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31842
 */
public class AtagoClassDDG extends EntityType
{
    /** Default constructor */
    public AtagoClassDDG()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18886, Guided Missile Destroyer (DDG)
        setSubCategory((byte)4); // uid 31842, Atago Class (DDG)
    }
}
