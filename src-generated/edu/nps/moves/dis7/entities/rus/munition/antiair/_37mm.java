package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@677349fb;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 20419
 */
public class _37mm extends EntityType
{
    /** Default constructor */
    public _37mm()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 20393, Ballistic
        setSubCategory((byte)12); // uid 20419, 37 mm
    }
}
