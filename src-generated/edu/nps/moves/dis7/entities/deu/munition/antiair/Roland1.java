package edu.nps.moves.dis7.entities.deu.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68dfda77;
 * Country: Germany (DEU);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 21203
 */
public class Roland1 extends EntityType
{
    /** Default constructor */
    public Roland1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21201, Guided
        setSubCategory((byte)1); // uid 21202, Roland
        setSpecific((byte)1); // uid 21203, Roland 1
    }
}
