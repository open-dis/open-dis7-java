package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5bda8e08
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 25446
 */
public class A541Birkholm extends EntityType
{
    public A541Birkholm()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 25444, Auxiliary
        setSubCategory((byte)1); // uid 25445, Holm Class
        setSpecific((byte)1); // uid 25446, A541 Birkholm
    }
}
