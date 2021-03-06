package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a120c88;
 * Country: Other;
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32733
 */
public class Civilianw545AK74 extends EntityType
{
    /** Default constructor */
    public Civilianw545AK74()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32731, Civilian
        setSubCategory((byte)5); // uid 32732, Assault Rifles
        setSpecific((byte)10); // uid 32733, Civilian w/ 5.45 AK-74
    }
}
