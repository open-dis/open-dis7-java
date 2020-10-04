package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@192c3f1e
 * Country: Egypt (EGY)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27498
 */
public class WesterwaldClassType760AmmunitionTransports extends EntityType
{
    public WesterwaldClassType760AmmunitionTransports()
    {
        setCountry(Country.EGYPT_EGY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27493, Auxiliary
        setSubCategory((byte)2); // uid 27498, Westerwald Class (Type 760, Ammunition, Transports)
    }
}
