package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@548d708a;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16039
 */
public class JeanneDArcClassHeloCV extends EntityType
{
    /** Default constructor */
    public JeanneDArcClassHeloCV()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)13); // uid 16038, Cruiser/Helicopter Carrier
        setSubCategory((byte)1); // uid 16039, Jeanne DArc Class (Helo CV)
    }
}
