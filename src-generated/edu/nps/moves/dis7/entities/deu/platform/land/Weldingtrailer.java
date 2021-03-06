package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@41f69e84;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 16312
 */
public class Weldingtrailer extends EntityType
{
    /** Default constructor */
    public Weldingtrailer()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)20); // uid 16311, Maintenance equipment trailer
        setSubCategory((byte)1); // uid 16312, Welding trailer
    }
}
