package edu.nps.moves.dis7.entities.chl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27808f31;
 * Country: Chile (CHL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27514
 */
public class LM36GuardiamarineRiquelme extends EntityType
{
    /** Default constructor */
    public LM36GuardiamarineRiquelme()
    {
        setCountry(Country.CHILE_CHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27512, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27513, Tiger Class (Type 148)
        setSpecific((byte)1); // uid 27514, LM-36 Guardiamarine Riquelme
    }
}
