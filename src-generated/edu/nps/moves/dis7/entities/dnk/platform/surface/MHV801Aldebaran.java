package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@fbd1f6
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 25486
 */
public class MHV801Aldebaran extends EntityType
{
    public MHV801Aldebaran()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 25472, Coast Guard Boats
        setSubCategory((byte)2); // uid 25485, MHV 800 Class
        setSpecific((byte)1); // uid 25486, MHV-801 Aldebaran
    }
}
