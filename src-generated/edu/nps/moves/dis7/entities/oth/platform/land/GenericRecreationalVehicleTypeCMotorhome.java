package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@15051a0;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25963
 */
public class GenericRecreationalVehicleTypeCMotorhome extends EntityType
{
    /** Default constructor */
    public GenericRecreationalVehicleTypeCMotorhome()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)90); // uid 24835, Recreational
        setSubCategory((byte)13); // uid 25963, Generic Recreational Vehicle, Type C Motorhome
    }
}
