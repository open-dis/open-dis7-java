package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@39ba5a14;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28651
 */
public class CanberraClassLandingHelicopterDock extends EntityType
{
    /** Default constructor */
    public CanberraClassLandingHelicopterDock()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 28650, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 28651, Canberra Class (Landing Helicopter Dock)
    }
}
