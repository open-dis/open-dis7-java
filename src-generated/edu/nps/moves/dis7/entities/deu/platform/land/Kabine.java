package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@471a9022
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28060
 */
public class Kabine extends EntityType
{
    public Kabine()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)30); // uid 28059, Operations Facility
        setSubCategory((byte)1); // uid 28060, Kabine
    }
}
