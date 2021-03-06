package edu.nps.moves.dis7.entities.aus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a0ac6e3;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 17616
 */
public class S77Sheean extends EntityType
{
    /** Default constructor */
    public S77Sheean()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 17609, SSG (Conventional Guided Missile)
        setSubCategory((byte)1); // uid 17611, Collins Class
        setSpecific((byte)5); // uid 17616, S 77 Sheean
    }
}
