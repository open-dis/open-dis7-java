package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4487c0c2
 * Country: Saudi Arabia (SAU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17890
 */
public class ModDuranceClassreplenishmentship extends EntityType
{
    public ModDuranceClassreplenishmentship()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17889, Auxiliary
        setSubCategory((byte)1); // uid 17890, Mod Durance Class (replenishment ship)
    }
}
