package edu.nps.moves.dis7.entities.swe.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4674d90;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26852
 */
public class CombatBoat90HS extends EntityType
{
    /** Default constructor */
    public CombatBoat90HS()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 26849, Landing Craft
        setSubCategory((byte)1); // uid 26850, Combat Boat 90 Class
        setSpecific((byte)2); // uid 26852, Combat Boat 90HS
    }
}
