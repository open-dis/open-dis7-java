package edu.nps.moves.dis7.entities.phl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7de4a01f;
 * Country: Philippines (PHL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 33026
 */
public class _602DavaodelSur extends EntityType
{
    /** Default constructor */
    public _602DavaodelSur()
    {
        setCountry(Country.PHILIPPINES_PHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 33023, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 33024, Tarlac Class
        setSpecific((byte)2); // uid 33026, 602 Davao del Sur
    }
}
