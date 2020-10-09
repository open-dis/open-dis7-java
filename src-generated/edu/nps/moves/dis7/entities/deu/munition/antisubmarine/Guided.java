package edu.nps.moves.dis7.entities.deu.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@47187f50
 * Country: Germany (DEU)
 * Entity kind: Munition
 * Domain: ANTI_SUBMARINE
 *
 * Entity type uid: 21244
 */
public class Guided extends EntityType
{
    public Guided()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 21244, Guided
    }
}
