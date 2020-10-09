package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7a7471ce
 * Country: Japan (JPN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18888
 */
public class TachikazeClassDDG extends EntityType
{
    public TachikazeClassDDG()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18886, Guided Missile Destroyer (DDG)
        setSubCategory((byte)2); // uid 18888, Tachikaze Class (DDG)
    }
}
