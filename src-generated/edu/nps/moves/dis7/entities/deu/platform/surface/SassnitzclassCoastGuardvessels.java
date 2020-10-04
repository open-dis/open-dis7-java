package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5e403b4a
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 16462
 */
public class SassnitzclassCoastGuardvessels extends EntityType
{
    public SassnitzclassCoastGuardvessels()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 16416, Light/patrol craft
        setSubCategory((byte)5); // uid 16462, Sassnitz class (Coast Guard vessels)
    }
}
