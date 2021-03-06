package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@55182842;
 * Country: Denmark (DNK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29458
 */
public class P556Svaerdfisken extends EntityType
{
    /** Default constructor */
    public P556Svaerdfisken()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18790, Light/ Patrol Craft
        setSubCategory((byte)4); // uid 29451, Flyvefisken Class
        setSpecific((byte)7); // uid 29458, P556 Svaerdfisken
    }
}
