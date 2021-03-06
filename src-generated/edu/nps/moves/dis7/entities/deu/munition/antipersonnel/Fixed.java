package edu.nps.moves.dis7.entities.deu.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@7ceb6c45;
 * Country: Germany (DEU);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 21251
 */
public class Fixed extends EntityType
{
    /** Default constructor */
    public Fixed()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 21251, Fixed
    }
}
