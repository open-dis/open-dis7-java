package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30c15d8b;
 * Country: Denmark (DNK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 25449
 */
public class A544Alholm extends EntityType
{
    /** Default constructor */
    public A544Alholm()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 25444, Auxiliary
        setSubCategory((byte)1); // uid 25445, Holm Class
        setSpecific((byte)4); // uid 25449, A544 Alholm
    }
}
