package edu.nps.moves.dis7.entities.deu.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ab595c8;
 * Country: Germany (DEU);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 25729
 */
public class _27mmDM11 extends EntityType
{
    /** Default constructor */
    public _27mmDM11()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21206, Ballistic
        setSubCategory((byte)3); // uid 25727, 27 mm
        setSpecific((byte)2); // uid 25729, 27 mm DM 11
    }
}
