package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3234f74e;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26943
 */
public class VeryLargeMotorboatgreaterthan65ft198m extends EntityType
{
    /** Default constructor */
    public VeryLargeMotorboatgreaterthan65ft198m()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 26942, Private Motorboat
        setSubCategory((byte)4); // uid 26943, Very Large Motorboat (greater than 65ft/19.8m)
    }
}
