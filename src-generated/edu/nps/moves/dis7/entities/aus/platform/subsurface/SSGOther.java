package edu.nps.moves.dis7.entities.aus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@19dfb72a;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 17610
 */
public class SSGOther extends EntityType
{
    /** Default constructor */
    public SSGOther()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 17609, SSG (Conventional Guided Missile)
        setSubCategory((byte)0); // uid 17610, SSG, Other
    }
}
