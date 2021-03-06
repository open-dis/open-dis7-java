package edu.nps.moves.dis7.entities.usa.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e154848;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 27340
 */
public class M974SRTA extends EntityType
{
    /** Default constructor */
    public M974SRTA()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 19810, Ballistic
        setSubCategory((byte)2); // uid 19819, 7.62 mm
        setSpecific((byte)12); // uid 27340, M974 SRTA
    }
}
