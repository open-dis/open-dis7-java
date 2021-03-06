package edu.nps.moves.dis7.entities.dza.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6438a396;
 * Country: Algeria (DZA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 32592
 */
public class _032ElHoggar extends EntityType
{
    /** Default constructor */
    public _032ElHoggar()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27035, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 27036, Kilo Class
        setSpecific((byte)6); // uid 32592, 032 El Hoggar
    }
}
