package edu.nps.moves.dis7.entities.che.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@c27a3a2
 * Country: Switzerland (CHE)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 32950
 */
public class PiranhaV extends EntityType
{
    public PiranhaV()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 32943, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 32950, Piranha V
    }
}