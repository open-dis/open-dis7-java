package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@33a053d;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24643
 */
public class GenericLargeMotorboatupto65ft198m extends EntityType
{
    /** Default constructor */
    public GenericLargeMotorboatupto65ft198m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 24640, Private Motorboat
        setSubCategory((byte)3); // uid 24643, Generic Large Motorboat (up to 65ft/19.8m)
    }
}
