package edu.nps.moves.dis7.entities.deu.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@42a0786f;
 * Country: Germany (DEU);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 25742
 */
public class _46x30mmBall extends EntityType
{
    /** Default constructor */
    public _46x30mmBall()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 21247, Ballistic
        setSubCategory((byte)4); // uid 25741, 4.6 mm
        setSpecific((byte)1); // uid 25742, 4.6x30 mm Ball
    }
}
