package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@540a903b;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13804
 */
public class Orlanclasswingingroundeffectcraftaircushion extends EntityType
{
    /** Default constructor */
    public Orlanclasswingingroundeffectcraftaircushion()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 13796, Air cushion/Surface effect
        setSubCategory((byte)8); // uid 13804, Orlan class (wing-in-ground-effect craft) (air cushion)
    }
}
