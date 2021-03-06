package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6c2f1700;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26000
 */
public class GenericPoliceChief extends EntityType
{
    /** Default constructor */
    public GenericPoliceChief()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 25997, Utility/Emergency Car
        setSubCategory((byte)3); // uid 26000, Generic Police Chief
    }
}
