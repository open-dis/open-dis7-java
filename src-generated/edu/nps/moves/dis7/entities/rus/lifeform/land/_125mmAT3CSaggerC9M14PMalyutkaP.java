package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@756c67cd;
 * Country: Russia (RUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32159
 */
public class _125mmAT3CSaggerC9M14PMalyutkaP extends EntityType
{
    /** Default constructor */
    public _125mmAT3CSaggerC9M14PMalyutkaP()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)50); // uid 32156, Anti-Tank Missiles
        setSpecific((byte)172); // uid 32159, 125mm AT-3C Sagger C/9M14P Malyutka-P
    }
}
