package edu.nps.moves.dis7.entities.ven.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f882465
 * Country: Venezuela (Bolivarian Republic of) (VEN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27762
 */
public class F21MariscalSucre extends EntityType
{
    public F21MariscalSucre()
    {
        setCountry(Country.VENEZUELA_BOLIVARIAN_REPUBLIC_OF_VEN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27760, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27761, Lupo Class
        setSpecific((byte)1); // uid 27762, F-21 Mariscal Sucre
    }
}
