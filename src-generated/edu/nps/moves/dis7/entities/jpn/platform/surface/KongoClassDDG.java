package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2c104774;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18887
 */
public class KongoClassDDG extends EntityType
{
    /** Default constructor */
    public KongoClassDDG()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18886, Guided Missile Destroyer (DDG)
        setSubCategory((byte)1); // uid 18887, Kongo Class (DDG)
    }
}
