package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4febb875
 * Country: Italy (ITA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18338
 */
public class DurandDeLaPenneClass extends EntityType
{
    public DurandDeLaPenneClass()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18334, Guided Missile Destroyer (DDG)
        setSubCategory((byte)2); // uid 18338, Durand De La Penne Class
    }
}
