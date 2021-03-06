package edu.nps.moves.dis7.entities.phl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@19f9d595;
 * Country: Philippines (PHL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 33025
 */
public class _601Tarlac extends EntityType
{
    /** Default constructor */
    public _601Tarlac()
    {
        setCountry(Country.PHILIPPINES_PHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 33023, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 33024, Tarlac Class
        setSpecific((byte)1); // uid 33025, 601 Tarlac
    }
}
