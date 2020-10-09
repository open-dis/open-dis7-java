package edu.nps.moves.dis7.entities.chl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@42eca56e
 * Country: Chile (CHL)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27515
 */
public class LM37TenienteOrella extends EntityType
{
    public LM37TenienteOrella()
    {
        setCountry(Country.CHILE_CHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27512, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27513, Tiger Class (Type 148)
        setSpecific((byte)2); // uid 27515, LM-37 Teniente Orella
    }
}
