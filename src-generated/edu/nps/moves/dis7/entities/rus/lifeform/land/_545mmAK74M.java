package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68a426c3;
 * Country: Russia (RUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32136
 */
public class _545mmAK74M extends EntityType
{
    /** Default constructor */
    public _545mmAK74M()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)5); // uid 32133, Assault Rifles
        setSpecific((byte)12); // uid 32136, 5.45mm AK-74M
    }
}
